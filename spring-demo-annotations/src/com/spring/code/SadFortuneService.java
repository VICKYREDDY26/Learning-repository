package com.spring.code;

public class SadFortuneService implements FortuneService{


    @Override
    public String getFortune() {
        return "Today is a Sad day";
    }
}
