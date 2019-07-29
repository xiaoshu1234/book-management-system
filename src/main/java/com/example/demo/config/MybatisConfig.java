package com.example.demo.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import javax.sql.DataSource;

/**
 * @author shuweiwang
 * @className MybatisConfig
 * @description TODO
 * @date 2019-05-22 20:56
 **/
@Configuration
@MapperScan(basePackages = DataSourceConfig.MYBATIS_MAPPER_PACKAGE_PATH, sqlSessionFactoryRef = "gpsSqlSessionFactory")
public class MybatisConfig {

    /**
     * sqlSessionFactory
     *
     * @return
     * @throws Exception
     */
    @Bean("gpsSqlSessionFactory")
    @Primary
    public SqlSessionFactory gpsSqlSessionFactory(DataSource DataSource) throws Exception {
        if (DataSource != null) {
            SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
            PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
            bean.setDataSource(DataSource);
//            bean.setConfigLocation(resolver.getResource(DataSourceConfig.MYBATIS_CONFIG_LOCATION_PATH));
//            bean.setMapperLocations(resolver.getResources(DataSourceConfig.MYBATIS_MAPPER_XML_PATH));
            bean.setMapperLocations(resolver.getResources(ResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX + DataSourceConfig.MYBATIS_MAPPER_XML_PATH));
            return bean.getObject();
        }
        return null;
    }
}
