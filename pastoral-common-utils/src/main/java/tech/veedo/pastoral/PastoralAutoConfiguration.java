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
    @ConditionalOnProperty(prefix = "veedo.pastoral.snow-flake", name = "enabled", havingValue = "true")
    public void generateIdUtilSnowFlake() {
        Optional<Long> opDCID = Optional.ofNullable(pastoralProperties.getSnowFlake().getDataCenterId());
        Optional<Long> opWID = Optional.ofNullable(pastoralProperties.getSnowFlake().getWorkerId());

        IdUtils.generateSnowFlake(opDCID.isPresent()?opDCID.get():0L, opWID.isPresent()?opWID.get():0L);
    }

}
