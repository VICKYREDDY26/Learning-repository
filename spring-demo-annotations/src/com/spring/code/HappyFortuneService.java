package com.spring.code;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "Today is Your Lucky Day!";
    }
}
