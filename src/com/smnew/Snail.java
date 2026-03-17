package com.smnew;

import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();

        scanner.close();

        if (a >= h) {
            System.out.println("1");
        } else if (a <= b) {
            System.out.println("Impossible");
        } else {
            int daily = a - b;
            int remainingHeight = h - a;
            int days = (remainingHeight + daily - 1) / daily + 1;

            System.out.println(days);

        }
    }
}
