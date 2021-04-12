package com.learnreactivespring;

public class TrackCoach implements Coach{

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "RUn hardf";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


    //add an init methd

    public void doMyStuff(){

        System.out.println("Track coach: inside init method");
    }
    //add an destry method

    public void shutdown(){
        System.out.println("inside shutdown");
    }
}
