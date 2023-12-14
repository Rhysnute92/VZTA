package Team5.SmartTownsOld;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

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