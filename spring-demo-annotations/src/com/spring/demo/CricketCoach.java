package com.spring.demo;

public class CricketCoach implements Coach {


    // create two fields such as cricket_Team_Name and team_Email_Address
    private String emailAddress;
    private String teamName;

    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: Inside setter Method- Set EmailAddress");
        this.emailAddress = emailAddress;
    }
    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        System.out.println("CricketCoach: Inside setter Method- Set TeamName");
        this.teamName = teamName;
    }

    private FortuneService fortuneService;

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: Inside setter Method- SetFortuneService");
        this.fortuneService = fortuneService;
    }
    // create a no-arg constructor
    public  CricketCoach() {
        System.out.println("CricketCoach: From inside of no-arg constructor");
    }
    @Override
    public String getDailyWorkout() {
        return "practice on  your skill on beamers";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
