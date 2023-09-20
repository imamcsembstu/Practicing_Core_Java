package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Get input from user by Scanner Class.
        Scanner input= new Scanner(System.in);

        System.out.println("Enter a input of your age: ");
        int age=input.nextInt();

        System.out.println("Enter your name: ");
        String name=input.next();

        System.out.println("Name of tolaba: "+name+"\nAge: "+age);

    }
}