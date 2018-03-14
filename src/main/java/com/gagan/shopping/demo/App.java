package com.gagan.shopping.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
/*@ComponentScan("com.gagan.shopping.demo.configuration")*/
public class App
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
