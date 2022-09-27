package com.spring.demo;

public class TrackCoach implements Coach {


    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "get daily workout and Run 5K everyday";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It: "+ fortuneService.getFortune();
    }
}
