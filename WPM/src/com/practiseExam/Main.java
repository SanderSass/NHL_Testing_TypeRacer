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
        getCountdownTimer();
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
        System.out.println("Your wpm is " + wpm + "!");
    }

    public static void getParagraph()
    {
        Random rand = new Random();
        for (int i = 0; i < 25; i++)
        {
            System.out.print(words[rand.nextInt(20)] + " ");
        }
    }
    public static void getCountdownTimer() throws InterruptedException {
        int charsWritten = 0;
        long start = System.currentTimeMillis();
        while (1 > 0) {
            Thread.sleep(1000);
            long elapsedTime2 = System.currentTimeMillis() - start;
            elapsedTime2 = elapsedTime2 / 1000;

            String seconds = Integer.toString((int) (elapsedTime2 % 60));
            String minutes = Integer.toString((int) ((elapsedTime2 % 3600) / 60));
            String hours = Integer.toString((int) (elapsedTime2 / 3600));

            if (seconds.length() < 2) {
                seconds = "0" + seconds;
            }

            if (minutes.length() < 2) {
                minutes = "0" + minutes;
            }

            if (hours.length() < 2) {
                hours = "0" + hours;
            }

            String writeThis = hours + ":" + minutes + ":" + seconds;

            for (int i = 0; i < charsWritten; i++) {
                System.out.print("\b");
            }
            System.out.print(writeThis);
            charsWritten = writeThis.length();
        }
    }
}
