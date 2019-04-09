package tech.veedo.munchkin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
@EnableConfigurationProperties(MunchkinWorkflowProperties.class)
public class MunchkinWorkflowAutoConfiguration {
}
