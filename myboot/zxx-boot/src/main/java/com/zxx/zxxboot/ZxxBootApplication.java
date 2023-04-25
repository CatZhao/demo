package com.zxx.zxxboot;

import com.zxx.ZxxService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ZxxBootApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ZxxBootApplication.class, args);

        //SqlSessionFactory sqlSessionFactory = (SqlSessionFactory)context.getBean("sqlSessionFactory");
        //System.out.println(sqlSessionFactory);
        //ZxxService zxxService = (ZxxService)context.getBean("zxxService");

        //System.out.println(zxxService.test());

    }

}
