package com.lanxiang.guice;

import com.google.inject.name.Names;
import com.lanxiang.mapper.AddressMapper;
import com.lanxiang.mapper.UserMapper;
import com.lanxiang.service.UserService;
import com.lanxiang.service.impl.UserServiceImpl;

import java.util.Properties;
import java.util.ResourceBundle;

/**
 * Created by lanxiang on 16/9/6.
 */
public class ServiceModule extends PrivateMyBatisModule {

    private Properties properties;

    @Override
    protected void configure() {
        super.configure();
        register(UserService.class, UserServiceImpl.class);
        initDbProperties();
        Names.bindProperties(this.binder(), properties);
    }


    private void initDbProperties() {
        properties = new Properties();
        ResourceBundle rb = ResourceBundle.getBundle("db");
        properties.setProperty("mybatis.environment.id", "dev");
        properties.setProperty("JDBC.driver", rb.getString("db.classname"));
        properties.setProperty("JDBC.url", rb.getString("db.url"));
        properties.setProperty("JDBC.username", rb.getString("db.username"));
        properties.setProperty("JDBC.password", rb.getString("db.password"));
        properties.setProperty("JDBC.autoCommit", "false");
    }

    protected Class[] mapperClasses() {
        return new Class[]{
                AddressMapper.class,
                UserMapper.class
        };
    }
}
