package com.spring.code;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(value = "com.spring.code")
@PropertySource("classpath:sport.properties")
public class SportConfig {

        // define a bean for our sad fortune Service
        @Bean
        public FortuneService sadFortuneService() {
            return new SadFortuneService();
        }

        @Bean
        public  Coach swimCoach(){
            return new SwimCoach(sadFortuneService());
        }

        //define bean for our swim coach AND inject dependency

}
