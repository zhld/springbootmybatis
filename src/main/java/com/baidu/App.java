package com.baidu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by ASUS on 2018/1/16.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.baidu"})
@MapperScan("com.baidu.mapper")
@EnableTransactionManagement  //开启事务
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
