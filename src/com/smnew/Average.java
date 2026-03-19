package com.smnew;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int current = scanner.nextInt();
        int i = 0;
        int sum = 0;

        while(current != 0){
            sum += current;
            current = scanner.nextInt();
            i++;
        }
        System.out.println((sum/i));
    }
}

// 787 5 32 8 5 39 0