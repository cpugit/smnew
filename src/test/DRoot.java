package test;

public class DRoot {

    public static int digitalRoot(int n) {
        return (n != 0 && n%9 == 0) ? 9 : n % 9;
    }

    public static void main(String[] args) {
        int n = 63;
        System.out.println(digitalRoot(n)); // Output: 6
    }
}