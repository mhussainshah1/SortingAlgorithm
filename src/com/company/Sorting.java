package com.company;

        import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        char a,b,c,temp;

        System.out.println("Enter a letter");
        Scanner keyboard = new Scanner (System.in);
        a =  keyboard.next().charAt(0);

        System.out.println("Enter a letter");
        b =  keyboard.next().charAt(0);

        System.out.println("Enter a letter");
        c =  keyboard.next().charAt(0);

        if (a > c){
            temp = a;
            a = c;
            c = temp;
        }

        if (a > b){
            temp = a;
            a = b;
            b = temp;
        }

        if (b > c){
            temp = b;
            b = c;
            c = temp;
        }

        System.out.println(" The three letters are " + a + "," + "," + b + "," + c);
        System.out.printf(" The three letters are %s, %s, %s", a, b, c);

    }
}
