package com.app.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Properties;

/***
 * @author saurabh vaish
 * @version 1.0
 * @since 27/01/20
 ***/

@Configuration
@EnableTransactionManagement
@ComponentScan("com.app")
public class AppConfig {

    @Bean
    public BasicDataSource dataSource()
    {
        BasicDataSource bs = new BasicDataSource();
        bs.setDriverClassName("org.postgresql.Driver");
        bs.setUrl("jdbc:postgresql://localhost:5432/srv");
        bs.setUsername("postgres");
        bs.setPassword("thrymr@123");
        bs.setInitialSize(1);
        bs.setMaxTotal(2);
        bs.setMinIdle(1);
        bs.setMaxIdle(1);
        return bs;
    }

    // session factory
    @Bean
    public LocalSessionFactoryBean sessionFactory()
    {
        LocalSessionFactoryBean sf = new LocalSessionFactoryBean();
        sf.setDataSource(dataSource());
        sf.setPackagesToScan("com.app.model");
        sf.setHibernateProperties(props());
        return sf;
    }


    // hibernate properties

    public Properties props()
    {
        Properties p = new Properties();
        p.put("hibernate.dialect","org.hibernate.dialect.PostgreSQLDialect");
        p.put("hibernate.show_sql","true");
        p.put("hibernate.format_sql","true");
        p.put("hibernate.hbm2ddl.auto","update");
        return p;
    }


    // HibernateTemplate
    @Bean
    public HibernateTemplate hibernateTemplate()
    {
        HibernateTemplate ht = new HibernateTemplate();
        ht.setSessionFactory(sessionFactory().getObject());
        return ht;
    }

    // HibernateTransactionManager
    @Bean
    public HibernateTransactionManager transactionManager()
    {
        HibernateTransactionManager htm = new HibernateTransactionManager();
        htm.setSessionFactory(sessionFactory().getObject());
        return htm;
    }

}
