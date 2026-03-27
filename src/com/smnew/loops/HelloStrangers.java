package com.smnew.loops;

import java.io.IOException;
import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int strangers = scanner.nextInt();
        scanner.nextLine();

        if (strangers == 0) {
            System.out.println("Oh, it looks like there is no one here");
        } else if (strangers < 0) {
            System.out.println("Seriously? Why so negative?");
        } else {
            String[] arr = new String[strangers];

            for (int i = 0; i < strangers; i++) {
                arr[i] = scanner.nextLine();
            }
            for (String s : arr) {
                System.out.println("Hello, " + s);
            }
        }
        scanner.close();
    }
}

