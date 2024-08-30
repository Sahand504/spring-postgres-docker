package configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

//    @Value("${spring.datasource.url}")
//    private String URL;
//    @Value("${spring.datasource.username}")
//    private String USERNAME;
//    @Value("${spring.datasource.password}")
//    private String PASSWORD;
//
//    @Bean
//    public DataSource getDataSource() {
//        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
//        dataSourceBuilder.driverClassName("org.h2.Driver");
//        dataSourceBuilder.url(URL);
//        dataSourceBuilder.username(USERNAME);
//        dataSourceBuilder.password(PASSWORD);
//        return dataSourceBuilder.build();
//    }
}
