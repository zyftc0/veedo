package tech.veedo.munchkin;

import com.zaxxer.hikari.HikariConfig;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Slf4j
@Data
@ConfigurationProperties(prefix = "veedo.munchkin")
public class MunchkinWorkflowProperties {

    /**
     * 启用工作流组件
     */
    private Boolean enabled = false;

    private WfDatesource wfDatesource;

    public class WfDatesource extends HikariConfig {}

}
