package com.javangr;

public class Main {

    public static void main(String[] args) {
        int[] dummy_array = {1, 2, 3};
        int dummy_array_length = dummy_array.length;

        int args_length = args.length;

        if(dummy_array_length == args_length){
            System.out.println("Nice!");
        }
        else {
            System.out.println("Fail");
        }
    }
}
