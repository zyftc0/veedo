package tech.veedo.munchkin.database;

import com.alibaba.fastjson.JSON;
import com.zaxxer.hikari.HikariDataSource;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.BeanInitializationException;
import org.springframework.beans.factory.DisposableBean;
import tech.veedo.munchkin.MunchkinWorkflowProperties;

@Slf4j
public class DatabaseAssistant implements DisposableBean {

    private HikariDataSource hikariDataSource;

    private QueryRunner queryRunner;

    public QueryRunner getQueryRunner() {
        return queryRunner;
    }

    public DatabaseAssistant(MunchkinWorkflowProperties munchkinWorkflowProperties) {
        log.info("workflow's db properties is : {}", JSON.toJSONString(munchkinWorkflowProperties.getWfDatesource()));
        if (munchkinWorkflowProperties.getWfDatesource().getJdbcUrl() == null) {
            throw new BeanInitializationException("Init DatabaseAssistant Error. please fill the jdbc-url property");
        }
        hikariDataSource = new HikariDataSource(munchkinWorkflowProperties.getWfDatesource());
        queryRunner = new QueryRunner(hikariDataSource);
        log.info("the DatabaseAssistant inited completed.");
    }

    /**
     * Invoked by the containing {@code BeanFactory} on destruction of a bean.
     *
     * @throws Exception in case of shutdown errors. Exceptions will get logged
     *                   but not rethrown to allow other beans to release their resources as well.
     */
    @Override
    public void destroy() throws Exception {
//        hikariDataSource.close();
        log.info("the workflow plugin's {} CP is destroyed.", "Hikari");
    }
}
