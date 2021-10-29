package com.company;
import java.util.Scanner;
public class Ex621App {
    public static void main(String[] args){
        int a;
        int b;
        double quotient;
        double remaider;
        Scanner scan = new Scanner(System.in);
        Ex621 sc = new Ex621();
        System.out.printf("Enter the first number(a): ");
        a = scan.nextInt();
        System.out.printf("Enter the second number(b): ");
        b = scan.nextInt();
        quotient = sc.sepqt(a, b);
        remaider = sc.seprem(a, b);

        System.out.println("");
        System.out.println("Part of the quotient is: " + quotient);
        System.out.println("The integer remainder is: " + remaider);

        Scanner dig = new Scanner(System.in);
        System.out.println("Enter the integer number between 1 and 99999 : ");
        sc.displaydigits(dig.nextInt());
    }
}
