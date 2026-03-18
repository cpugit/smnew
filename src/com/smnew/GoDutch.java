package com.smnew;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalAmount = scanner.nextDouble();
        int friends = scanner.nextInt();
        scanner.close();

        if (totalAmount < 0 ){
            System.out.println("Bill total amount cannot be negative");
        } else if (friends <= 0) {
            System.out.println("Number of friends cannot be negative or zero");
        } else {
            int partToPay = (int)((totalAmount / friends) * 1.1);
            System.out.println(partToPay);
        }
    }
}
