package com.smnew;

import java.util.Arrays;

public class LocalMaximaRemove {

    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 6, 7, -5};

        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array) {

        boolean[] isMax = new boolean[array.length];

        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                if (array.length > 1 && array[i] > array[i + 1]) {
                    isMax[i] = true;
                }
            } else if (i == array.length - 1) {
                if (array[i] > array[i - 1]) {
                    isMax[i] = true;
                }
            } else {
                if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                    isMax[i] = true;
                }
            }
        }

        int count = 0;
        for (boolean b : isMax) {
            if (!b) count++;
        }

        int[] result = new int[count];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (!isMax[i]) {
                result[index++] = array[i];
            }
        }
        return result;
    }
}

