package com.javangr;

public class Main {

    public static void main(String[] args) {
        String concrete_input_1 = "Hello";
        String concrete_input_2 = "GoodBye";

        boolean res = concrete_input_1.equals(concrete_input_2);

        if (res) {
            System.out.println("Win");
        } else {
            System.out.println("Lose");
        }
        System.out.println("Done");

    }
}
