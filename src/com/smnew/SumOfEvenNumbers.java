package com.smnew;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int[] array = new int [] {2, 3};

        System.out.println(sum(array));
    }

    public static int sum(int[] array) {

        int total = 0;

        if (array == null){
            return total;
        }

        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) == 0){
                total += array[i];
            }
        }
        return total;
    }
}
