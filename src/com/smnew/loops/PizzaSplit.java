package com.smnew.loops;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int people = scanner.nextInt();
        int piecesPerPizzaStart = scanner.nextInt();
        int piecesPerPizza = piecesPerPizzaStart;
        int pizzas = 1;

        while ((piecesPerPizza % people) != 0){
            pizzas++;
            piecesPerPizza += piecesPerPizzaStart;
        }
        System.out.println(pizzas);
    }
}
