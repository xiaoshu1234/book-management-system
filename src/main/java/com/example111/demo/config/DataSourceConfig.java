package com.example111.demo.config;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * @author shuweiwang
 * @className DataSourceConfig
 * @description TODO
 * @date 2019-07-28 16:54
 **/
@Configuration
@MapperScan(basePackages = "com.example111.demo.mapper", sqlSessionFactoryRef = "demoSqlSessionFactory")
public class DataSourceConfig {

    private static final String MYBATIS_CONFIG_LOCATION_PATH = "classpath:mapper/mybatis-config.xml";

    private static final String MYBATIS_MAPPER_XML_PATH = "classpath:mapper/**/*Mapper.xml";

    @Bean
    @Primary
    @ConfigurationProperties(prefix = "book.system")
    public DataSource dataSource() {
        DataSource dataSource = DataSourceBuilder.create().type(HikariDataSource.class).build();
        return dataSource;
    }


    @Bean("demoSqlSessionFactory")
    @Primary
    public SqlSessionFactory demoSqlSessionFactory(DataSource dataSource) throws Exception {
        if (dataSource != null) {
            SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
            PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
            bean.setDataSource(dataSource);
            bean.setConfigLocation(resolver.getResource(DataSourceConfig.MYBATIS_CONFIG_LOCATION_PATH));
            bean.setMapperLocations(resolver.getResources(DataSourceConfig.MYBATIS_MAPPER_XML_PATH));
            return bean.getObject();
        }
        return null;
    }
}
