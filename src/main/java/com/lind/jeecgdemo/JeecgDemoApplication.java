package com.lind.jeecgdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.net.UnknownHostException;

@SpringBootApplication
@EnableSwagger2
public class JeecgDemoApplication {
    public static void main(String[] args) throws UnknownHostException {
        SpringApplication.run(JeecgDemoApplication.class, args);
    }
}
