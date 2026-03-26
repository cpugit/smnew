package com.smnew;

import java.util.Arrays;

class CycleSwap {

    public static void main(String[] args) {
        int[] array = new int[]{ 1, 3, 2, 7, 4 };
        CycleSwap.cycleSwap(array, 5);
        System.out.println(Arrays.toString(array));
    }

    static void cycleSwap(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }

        int last = array[array.length - 1];

        // Shift elements to the right
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = last;
    }

    static void cycleSwap(int[] array, int shift) {
        if (array == null || array.length <= 1 || shift == 0) {
            return;
        }

        int n = array.length;
        shift = shift % n; // handle cases where shift == length

        // Reverse entire array
        reverse(array, 0, n - 1);

        // Reverse first 'shift' elements
        reverse(array, 0, shift - 1);

        // Reverse the rest
        reverse(array, shift, n - 1);

    }

    private static void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}

