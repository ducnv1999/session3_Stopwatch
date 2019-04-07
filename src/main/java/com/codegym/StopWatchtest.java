package com.codegym;
import java.util.Scanner;
public class StopWatchtest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StopWatch stopWatch = new StopWatch();
        int choice;
        do {
            System.out.println("Enter choose number:");
            System.out.println("1.Start");
            System.out.println("2.Stop");
            System.out.println("3.Elapse");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Start time: ");
                    stopWatch.start();
                    System.out.println(stopWatch.getStartTime());
                    break;
                case 2:
                    System.out.print("Stop time:");
                    stopWatch.stop();
                    System.out.println(stopWatch.getEndTime());
                    break;
                case 3:
                    System.out.println("Start time: "+ stopWatch.getStartTime());
                    System.out.println("Start time: "+ stopWatch.getEndTime());
                    System.out.println("Elapse time: "+stopWatch.getElapsedTime());
                    System.exit(0);
            }
        } while (choice != 0);
    }
}
