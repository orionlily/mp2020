package com.orion.mp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author li.lc
 */
@SpringBootApplication
@MapperScan("com.orion.mp.mapper")
public class Quickstart9001Main {
    public static void main(String[] args) {
        SpringApplication.run(Quickstart9001Main.class,args);
    }
}
