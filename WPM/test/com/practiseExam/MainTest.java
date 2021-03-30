package com.practiseExam;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @BeforeEach
    void setUp()
    {
        String[] words = {"Cake", "or", "pie", "I", "can", "tell", "a", "lot", "about", "you", "by", "which", "one", "you", "pick", "It", "may", "seem", "silly", "but", "cake"};
        Random rand = new Random();
    }

    @Test
    void BelowTimeLimitInSecondsWpm() throws InterruptedException {
        double startTime = LocalTime.now().toNanoOfDay();
        TimeUnit.SECONDS.sleep(3);
        double endTime = LocalTime.now().toNanoOfDay();
        double elapsedTime = endTime - startTime;
        double seconds = elapsedTime / 1000000000.0;
        if (seconds < 5)
        {
            System.out.println("Your completion time is " + (int) seconds + " seconds");

        }
        else
        {
            System.out.println("You failed to complete the paragraph in the given time limit.");

        }
        assertEquals(3, (int)seconds );
    }

    @Test
    void AboveTimeLimitInSecondsWpm() throws InterruptedException {
        double startTime = LocalTime.now().toNanoOfDay();
        TimeUnit.SECONDS.sleep(5);
        double endTime = LocalTime.now().toNanoOfDay();
        double elapsedTime = endTime - startTime;
        double seconds = elapsedTime / 1000000000.0;
        if (seconds < 5)
        {
            System.out.println("Your completion time is " + (int) seconds + " seconds");

        }
        else
        {
            System.out.println("You failed to complete the paragraph in the given time limit.");

        }
        assertEquals(5, (int)seconds );
    }

    @Test
    void getRandomisedParagraphFromWordsArray()
    {
        String[] words = {"Cake", "or", "pie", "I", "can", "tell", "a", "lot", "about", "you", "by", "which", "one", "you", "pick", "It", "may", "seem", "silly", "but", "cake"};
        Random rand = new Random();
        ArrayList<String> randomWordsArray = new ArrayList<String>();
        for (int i = 0; i < 25; i++)
        {
            String randomWordFromTheArray = words[rand.nextInt(20)];
            randomWordsArray.add(randomWordFromTheArray);
        }
        System.out.print(randomWordsArray + " ");
        for (int i = 0; i < words.length; i++)
        {
            assertNotEquals(words[i], randomWordsArray.get(i));
        }
    }
}