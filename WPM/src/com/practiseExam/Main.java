package com.practiseExam;

import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    static String[] words = {"Cake", "or", "pie", "I", "can", "tell", "a", "lot", "about", "you", "by", "which", "one", "you", "pick", "It", "may", "seem", "silly", "but", "cake"};

    public static void main(String[] args) throws InterruptedException {

        try
        {
            startCountdownTimer();

        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        getParagraph();
        getWpm();

    }


    public static void startCountdownTimer() throws InterruptedException
    {
        System.out.println("3");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("2");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("1");
        TimeUnit.SECONDS.sleep(1);
    }

    public static void getWpm()
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
            System.out.println("Your wpm is " + wpm + "!");
            System.out.println("Your completion time is " + (int) seconds + " seconds");
        }
        else
        {
            System.out.println("You failed to complete the paragraph in the given time limit.");
        }
    }

    public static void getParagraph()
    {
        Random rand = new Random();
        for (int i = 0; i < 25; i++)
        {
            System.out.print(words[rand.nextInt(20)] + " ");
        }
        System.out.print("\n");
    }
}
