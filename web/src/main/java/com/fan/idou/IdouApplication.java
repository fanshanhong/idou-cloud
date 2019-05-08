package com.fan.idou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("com.fan.idou.dao.mapper")
@SpringBootApplication
public class IdouApplication {

    public static void main(String[] args) {
        SpringApplication.run(IdouApplication.class, args);
    }
}
