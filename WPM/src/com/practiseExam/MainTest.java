package com.practiseExam;

import org.junit.Test;

import java.util.Random;
import java.util.concurrent.TimeUnit;

class MainTest {

    @Test
    void setUp()
    {
        String[] words = {"Cake?", "or", "pie", "I", "can", "tell", "a", "lot", "about", "you", "by", "which", "one", "you", "pick", "It", "may", "seem", "silly", "but", "cake"};
        Random rand = new Random();
    }

    @Test
    void startCountdownTimer() throws InterruptedException {
        System.out.println("3");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("2");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("1");
        TimeUnit.SECONDS.sleep(1);


    }

    @Test
    void getWpm()
    {

    }

    @Test
    void getParagraph()
    {

    }
}