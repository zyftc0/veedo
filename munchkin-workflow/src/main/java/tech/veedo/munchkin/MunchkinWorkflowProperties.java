package tech.veedo.munchkin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Slf4j
@ConfigurationProperties(prefix = "veedo.munchkin")
class MunchkinWorkflowProperties {

    /**
     * 启用工作流组件
     */
    private Boolean enabled = false;

}
