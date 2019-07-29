package com.example.demo.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @author shuweiwang
 * @className DataSourceConfig
 * @description TODO
 * @date 2019-05-22 20:48
 **/
@Configuration
public class DataSourceConfig {

    public static final String MYBATIS_MAPPER_PACKAGE_PATH = "com.example.demo.mapper";

    public static final String MYBATIS_DAO_PACKAGE_PATH = "com.mljr.gps.dao";

    public static final String MYBATIS_SECOND_DAO_PACKAGE_PATH = "com.mljr.gps.seconddao";

    public static final String MYBATIS_MAPPER_XML_PATH = "classpath:mapper/mybatis/mysql/**/*Mapper.xml";

    public static final String MYBATIS_DAO_XML_PATH = "classpath:mapper/mybatis/mysql/**/*Dao.xml";

    public static final String MYBATIS_SECOND_DAO_XML_PATH = "classpath:mapper/mybatis/mysql/**/*SecondDao.xml";

    public static final String MYBATIS_CONFIG_LOCATION_PATH = "classpath:mapper/mybatis/mysql/mybatis-config.xml";

    @Bean
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.gps")
    public DataSource dataSource() {
        DataSource dataSource =  DataSourceBuilder.create().type(HikariDataSource.class).build();
        return dataSource;
    }
}
