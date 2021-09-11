/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Thach Vo
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {

        Scanner scan = new Scanner(System.in);

        int max = 0;

        System.out.print("Enter the first number: ");
        int num1 = scan.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scan.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scan.nextInt();

        if ( num1 != num2 && num2 != num3) {

            max = Math.max(num1, num2);
            max = Math.max(max, num3);
        }

        else {

            System.exit(0);
        }

        System.out.print("The largest number is "+max+".");
    }
}
