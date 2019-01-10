package com.ljt.profiles;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

import static org.junit.Assert.assertNotNull;

public class DataSourceConfigTest {

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration(classes=DataSourceConfig.class)
    @ActiveProfiles("dev")
    public static class DevDataSourceTest{

        @Autowired
        private DataSource dataSource;

        @Test
        public void shouldBeEmbeddedDataSource(){
            assertNotNull(dataSource);
        }

    }

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration(classes=DataSourceConfig.class)
    @ActiveProfiles("prod")
    public static class ProductionDataSourceTest{

        @Autowired
        private DataSource dataSource;

        @Test
        public void shouldBeEmbeddedDataSource(){
            // should be null, because there isn't a datasource configured in JNDI
            assertNotNull(dataSource);
        }

    }

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration("classpath:datasource-config.xml")
    @ActiveProfiles("dev")
    public static class DevDataSourceTest_XMLConfig{

        @Autowired
        private DataSource dataSource;

        @Test
        public void shouldBeEmbeddedDataSource(){
            assertNotNull(dataSource);
        }

    }

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration("classpath:datasource-config.xml")
    @ActiveProfiles("prod")
    public static class ProductionDataSourceTest_XMLConfig{

        @Autowired(required = false)
        private DataSource dataSource;

        @Test
        public void shouldBeEmbeddedDataSource(){
            // should be null, because there isn't a datasource configured in JNDI
            assertNotNull(dataSource);
        }

    }
}
