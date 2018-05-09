package com.javangr;

public class Main {

    public static void foo(int a, int b){
       int c = a + b;
    }

    public static void main(String[] args) {
        int h = 256;
        int k = 3;
        //int s = (h + k) - k;
        foo(h, k);
/*        if(args.length <= 0){
            System.out.println("Not enough arguments...");;
        }
        else {
            int[] prova = {1, 2, 3};
            int length = prova.length;
*//*            String concrete_input = "Hello";
            String symbolic_input = args[0];

            boolean res = concrete_input.equals(symbolic_input);

            if (res) {
                System.out.println("Win");
            } else {
                System.out.println("Lose");
            }
            System.out.println("Done");*//*
        }*/
    }
}
