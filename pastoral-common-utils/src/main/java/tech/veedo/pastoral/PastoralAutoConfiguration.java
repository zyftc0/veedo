package tech.veedo.pastoral;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import javax.annotation.PostConstruct;
import java.util.Optional;

@Configuration
@EnableConfigurationProperties(value = PastoralProperties.class)
public class PastoralAutoConfiguration {

    @Autowired
    private PastoralProperties pastoralProperties;

    @PostConstruct
    public void generateIdUtilSnowFlake() {
        PastoralProperties.SnowFlake sf = Optional
                .ofNullable(pastoralProperties.getSnowFlake())
                .orElseGet(() -> new PastoralProperties.SnowFlake());

        if (sf.getEnabled()) {
            Long timestamp = Optional.ofNullable(sf.getInitTimestamp()).orElse(1558695216382L);
            Long opDCID = Optional.ofNullable(sf.getDataCenterId()).orElse(0L);
            Long opWID = Optional.ofNullable(sf.getWorkerId()).orElse(0L);

            IdUtils.generateSnowFlake(timestamp, opDCID, opWID);
        }
    }

}
