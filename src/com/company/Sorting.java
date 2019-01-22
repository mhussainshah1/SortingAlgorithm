package com.company;

import java.util.Scanner;

/**
 * Design an algorithm that will prompt the user for three letters, receive those letters as input, sort them into
 * ascending sequence and display them to the monitor
 */

public class Sorting {
    public static void main(String[] args) {
        char a, b, c, temp;

        Scanner keyboard = new Scanner(System.in);
//        System.out.println("Enter three letters");
//        a =  keyboard.next().charAt(0);
//        b =  keyboard.next().charAt(0);
//        c =  keyboard.next().charAt(0);
//
//        if (a > c){
//            temp = a;
//            a = c;
//            c = temp;
//        }
//
//        if (a > b){
//            temp = a;
//            a = b;
//            b = temp;
//        }
//
//        if (b > c){
//            temp = b;
//            b = c;
//            c = temp;
//        }
//
//        System.out.println("Three letters are " + a + "," + b + "," + c);

        String x, y, z, t;
        System.out.println("Enter three letters");
        x = keyboard.next();
        y = keyboard.next();
        z = keyboard.next();

        if (x.compareToIgnoreCase(z) > 0) { // x>z
            t = x;
            x = z;
            z = t;
        }
        if (x.compareToIgnoreCase(y) > 0) { // x>y
            t = x;
            x = y;
            y = t;
        }
        if (y.compareToIgnoreCase(z) > 0) { //y>z
            t = y;
            y = z;
            z = t;
        }
        System.out.printf("Three letters are %s,%s,%s", x, y, z);
    }
}
