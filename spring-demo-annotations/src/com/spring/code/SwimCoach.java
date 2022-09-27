package com.spring.code;


import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach{


    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;



    private FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up";
    }

    @Override
    public String getWeeklyWorkout() {
        return "overall Swim around 7000 meters a week";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


}
