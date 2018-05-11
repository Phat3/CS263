package com.javangr;


class Dummy {

    private int attr_1;

    public Dummy(int attr_1){
       this.attr_1 = attr_1;
    }

    public int foo(int a, int b){
        return a + b;
    }
}

public class Main {

    public static void main(String[] args) {
        Dummy d = new Dummy(12);
        int res = d.foo(11, 2);
        System.out.println(res);
    }
}
