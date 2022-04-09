package com.yx.tp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.yx.tp", "com.yx.ntr3.idworker"})
public class TpApplication {

    public static void main(String[] args) {
        SpringApplication.run(TpApplication.class, args);
    }

}
