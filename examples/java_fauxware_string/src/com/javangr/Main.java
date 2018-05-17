package com.javangr;

import java.util.Scanner;

public class Main {

    public static String sneaky = "SOSNEAKY";
    public String defaultAttribute = "CASA";

    public static int authenticate(String username, String password){
        if(password.equals(Main.sneaky)){
            return 1;
        }
        return 0;
    }

    public static void rejected(){
        System.out.println("Go away!");
        System.exit(1);
    }

    public static void accepted(){
        System.out.println("Welcome to the admin console, trusted user!\n");
        System.exit(1);
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();

        // System.out.println("Username: \n");
        int res = authenticate(username, password);

        if(res == 1){
            accepted();
        }
        else{
            rejected();
        }


    }
}
