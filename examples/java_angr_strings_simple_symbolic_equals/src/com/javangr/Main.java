package com.javangr;

public class Main {

    public static void main(String[] args) {
        String concrete_input = "Hello";
        String symbolic_input = args[0];

        boolean res = concrete_input.equals(symbolic_input);

        if (res) {
            System.out.println("Win");
        } else {
            System.out.println("Lose");
        }
        System.out.println("Done");

    }
}
