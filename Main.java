package com.company;
import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //bigliczby();
        // funkcje();
        // fahrenheitToCelsius();
        terminal();
    }
    public static void fahrenheitToCelsius() {

        System.out.println("Fahrenheit: ");
    }

    public static void funkcje() {
        int a = 5;
        int b = -15;
        System.out.println(Math.pow(a,b));
        System.out.println(Math.abs(a));
        System.out.println(Math.sqrt(Math.pow(b,2)));
    }

    public static void bigliczby(){
        BigInteger a = new BigInteger("546456334346");
        BigInteger b = new BigInteger("2");
        System.out.println(a.add(b));

    }

    public static void terminal() {

        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj wartość liczby a");
        int a = skaner.nextInt();
        System.out.println("Podaj wartość liczby b");
        int b = skaner.nextInt();
        int c = a+b;

        System.out.println("a+b=" +c);





    }



}