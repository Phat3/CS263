package com.javangr;

class A {

    public static String stat_0_a = "Static_0_A";
    public static String stat_1_a = "Static_1_A";

    A(){
        System.out.println("A constructor");
        System.out.println(stat_0_a);
    }

    A(int param){
        System.out.println("A constructor overloaded");
        System.out.println(stat_1_a);
    }

    public void foo(){
        System.out.println("I'm A!");
    }

    public void bar(){
        System.out.println("Only A has this method!");
    }
}

class B extends A {

    public static String stat_0_b = "Static_0_";

    B(){
        super(10);
        System.out.println("B constructor");
    }

    public void foo(){
        System.out.println("I'm B!");
        System.out.println(stat_0_b);
    }

    public void foo(int a){
        System.out.println("I'm B overloaded!");
    }
}

public class Main {

    public static void main(String[] args) {
//        B normal_obj = new B();
//        normal_obj.bar();
        A upcast_obj = new B();
//        upcast_obj.foo();
        ((B) upcast_obj).foo(12);
    }
}
