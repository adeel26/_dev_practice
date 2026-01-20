package com.adeel.Other_Path.Projects.AlarmClock;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // JAVA ALARM CLOCK

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;


        String filePath = "src/com/adeel/Other_Path/Projects/AlarmClock/retro-game-alarm.wav";

        while (alarmTime == null) {

            try {

                System.out.print("Enter an alarm time (HH:MM:SS): ");
                String inputTime = scanner.nextLine();

                alarmTime = LocalTime.parse(inputTime, formatter);
                System.out.println("Alarm set for " + alarmTime);

            } catch (Exception e) {
                System.out.println("Invalid format. Please use HH:MM:SS");
            }

        }

        AlarmClock alarmClock = new AlarmClock(alarmTime, filePath, scanner);
        Thread alaramThread = new Thread(alarmClock);
        alaramThread.start();


    }
}