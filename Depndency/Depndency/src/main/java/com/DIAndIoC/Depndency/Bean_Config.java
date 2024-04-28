package com.DIAndIoC.Depndency;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.DIAndIoC.Depndency")
public class Bean_Config {

    /*Instead of using @component in Doctor we can use @Bean to define own bean component*/

/*    @Bean
    public Doctor doctor(){
        return new Doctor();
    }*/
}
