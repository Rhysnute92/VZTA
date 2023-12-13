package Team5.SmartTowns;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mariadb://localhost:3306/test_towns");
        dataSource.setUsername("root");
        dataSource.setPassword("comsc");
        return dataSource;
    }

}
