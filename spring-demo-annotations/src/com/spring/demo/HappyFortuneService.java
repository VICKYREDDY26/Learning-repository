package com.spring.demo;

public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your Lucky Day!!";
    }
}
