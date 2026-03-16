package com.smnew;

import java.util.Scanner;

public class MeetAnAgent {
    final static int PASSWORD = 133976;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            switch (input) {
                case PASSWORD:
                    System.out.println("Hello, Agent");
                    break;
                default:
                    System.out.println("Access denied");
            }
        } else System.out.println("Access denied");
    }

}

