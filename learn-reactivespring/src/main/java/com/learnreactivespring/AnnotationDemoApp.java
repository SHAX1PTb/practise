package com.learnreactivespring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        //Read Config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //get bean from spring container
        Coach TennisCoach = context.getBean("tennisCoach", Coach.class);

        //call method on the bean
        System.out.println(TennisCoach.getDailyWorkout());
        System.out.println(TennisCoach.getDailyFortune());

        //close the context
        context.close();

    }
}
