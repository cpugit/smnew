package com.smnew.arrays;

import java.util.Arrays;

public class SumOfPrevious {

    public static void main(String[] args) {
        int[] array = new int[]{1, 21, 0, 4, 6, 11, 15, 26};

        System.out.println(Arrays.toString(getSumCheckArray(array)));
    }

    public static boolean[] getSumCheckArray(int[] array){

        boolean [] barray = new boolean[array.length];

        for (int i = 2; i < array.length; i++) {
            if (array[i] == (array[i-1] + array[i-2])){
                barray[i] = true;
            } else barray[i] = false;
        }
        return barray;
    }
}
