package tech.veedo.munchkin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.veedo.munchkin.database.DatabaseAssistant;

@Slf4j
@Configuration
@EnableConfigurationProperties(MunchkinWorkflowProperties.class)
public class MunchkinWorkflowAutoConfiguration {

    private MunchkinWorkflowProperties munchkinWorkflowProperties;

    @Bean
    public DatabaseAssistant generateAssistant() {
        return new DatabaseAssistant(munchkinWorkflowProperties);
    }

}
