package com.smnew.arrays;

public class Spiral {
    public static void main(String[] args) {
        int[][] spiral = Spiral.spiral(4, 3);

        for (int i = 0; i < spiral.length; i++) {
            for (int j = 0; j < spiral[i].length; j++) {
                System.out.print(String.format("%4s", spiral[i][j]));
            }
            System.out.println();
        }
    }
    static int[][] spiral(int rows, int columns) {

        int[][] result = new int[rows][columns];

        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = columns - 1;

        int num = 1;

        while (top <= bottom && left <= right) {

            // left → right (top row)
            for (int i = left; i <= right; i++) {
                result[top][i] = num++;
            }
            top++;

            // top → bottom (right column)
            for (int i = top; i <= bottom; i++) {
                result[i][right] = num++;
            }
            right--;

            // right → left (bottom row)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result[bottom][i] = num++;
                }
                bottom--;
            }

            // bottom → top (left column)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result[i][left] = num++;
                }
                left++;
            }
        }

        return result;
    }
}
