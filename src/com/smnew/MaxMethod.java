package com.smnew;

public class MaxMethod {
    public static int max(int[] values) {
        int max = values[0];

        for (int i = 0; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] val = {23, 45, 0, 883, 45};

        int result = MaxMethod.max(val);
        System.out.println(result);
    }
}
