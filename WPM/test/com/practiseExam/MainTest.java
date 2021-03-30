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
    void getWpm()
    {
        double startTime = LocalTime.now().toNanoOfDay();

        Scanner scan = new Scanner(System.in);
        String typedWords = scan.nextLine();

        double endTime = LocalTime.now().toNanoOfDay();
        double elapsedTime = endTime - startTime;
        double seconds = elapsedTime / 1000000000.0;
        int numChars = typedWords.length();

        // {(x characters / 5) / 1 min = y WPM} wpm calculation
        int wpm = (int) ((((double)numChars / 5) / seconds) * 60);


        scan.close();
        if (seconds < 120)
        {

        }
        else
        {

        }
    }

    @Test
    void getParagraph()
    {
        String[] words = {"Cake", "or", "pie", "I", "can", "tell", "a", "lot", "about", "you", "by", "which", "one", "you", "pick", "It", "may", "seem", "silly", "but", "cake"};
        Random rand = new Random();
        ArrayList<String> wordArrayList = new ArrayList<>();
        for (int i = 0; i < 20; i++)
        {
            String word = words[rand.nextInt(20)];
            if (wordArrayList.contains(word))
            {

            }
            else
            {
                wordArrayList.add(word);

            }
            assertNotEquals(words, wordArrayList);
        }
        for (int i = 0; i < 20; i++)
        {
            System.out.print(wordArrayList + " ");
        }
    }
}