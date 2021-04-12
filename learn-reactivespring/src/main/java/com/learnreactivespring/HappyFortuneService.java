package com.learnreactivespring;

import org.springframework.stereotype.Component;

@Component

public class HappyFortuneService implements FortuneService {


    @Override
    public String getFortune() {
        return "Today Is Lucky day!";
    }
}
