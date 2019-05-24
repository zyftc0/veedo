package tech.veedo.pastoral;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "veedo.pastoral")
public class PastoralProperties {

    private SnowFlake snowFlake;

    @Data
    protected class SnowFlake {

        private Boolean enabled = false;

        /**
         * 数据中心集群ID
         */
        private Long dataCenterId;

        /**
         * 服务器ID
         */
        private Long workerId;

    }

}
