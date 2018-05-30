package com.javangr;

public class Main {

    public static int foo(int a, int b){
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {
        int h = 256;
        int k = 3;
        int res = foo(h, k);
        if(res == 259) {
            System.out.println("Ok");
        }
        else{
            System.out.println("Fail");
        }
    }
}
