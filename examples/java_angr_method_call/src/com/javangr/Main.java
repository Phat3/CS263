package com.javangr;


class Dummy {

    private int attr_1;
    public int attr_2;
    public static int to_be_loaded = 42;

    public Dummy(int attr_1){
       this.attr_1 = attr_1;
    }

    public int foo(int a, int b){
        return a + b + Dummy.to_be_loaded;
    }

    public static int bar(int a){
        return a + 10;
    }
}

public class Main {

    public static void main(String[] args) {
        Dummy.bar(12);
        Dummy.to_be_loaded = 10;
        Dummy d = new Dummy(12);
        int attribute = d.attr_2;
        int res = d.foo(11, 2);
        int ciao = Dummy.to_be_loaded;
        System.out.println(res);
    }
}
