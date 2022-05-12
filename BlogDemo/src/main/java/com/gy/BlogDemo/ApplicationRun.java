package com.gy.BlogDemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 需求:
 *
 * @Author 顾杨
 * @date 2022年05月05日16:01
 * @Version 1.0
 */
@SpringBootApplication
@MapperScan("com.gy.BlogDemo.Mapper")
public class ApplicationRun {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun.class,args);
    }
}
