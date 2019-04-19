package tech.veedo.munchkin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.veedo.munchkin.database.DatabaseAssistant;
import tech.veedo.munchkin.workflow.server.inner.WorkflowManager;

@Slf4j
@Configuration
@EnableConfigurationProperties(MunchkinWorkflowProperties.class)
public class MunchkinWorkflowAutoConfiguration {

    @Autowired
    private MunchkinWorkflowProperties munchkinWorkflowProperties;

    @Bean
    @ConditionalOnProperty(prefix = "veedo.munchkin", name = "enabled", havingValue = "true")
    public DatabaseAssistant generateAssistant() {
        return new DatabaseAssistant(munchkinWorkflowProperties);
    }

    @Bean
    @ConditionalOnMissingBean(WorkflowManager.class)
    @ConditionalOnProperty(prefix = "veedo.munchkin", name = "enabled", havingValue = "true")
    public WorkflowManager generateWFManager() {
        return new WorkflowManager();
    }

}
