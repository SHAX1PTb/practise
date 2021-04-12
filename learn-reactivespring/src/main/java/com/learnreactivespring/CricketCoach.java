package com.learnreactivespring;

public class CricketCoach implements Coach{

    private String emailAddress;
    private String team;

    public CricketCoach() {}

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("Hello Team");
        this.team = team;
    }

    @Override
    public String getDailyWorkout() {
        return "Loce cricket";
    }

    @Override
    public String getDailyFortune() {
        return "Loce cricket";
    }
}
