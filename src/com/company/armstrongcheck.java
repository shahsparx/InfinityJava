package com.company;

import java.util.Scanner;

/**
 * Created by Lenovo on 04-10-2015.
 */
public class armstrongcheck {
    public static void main(String args[]) {
        int digits = 0, sum = 0, remainder;
        System.out.println("Enter your number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int temp = number;


        //Count the number of digits

        while (temp != 0) {
            digits++;
            temp = temp / 10;

        }
        temp = number;

        while (temp != 0) {
            remainder = temp % 10;
            sum = sum + power(remainder, digits);
            temp = temp / 10;
        }

        if (number == sum) {
            System.out.println(number + " is an Armstrong number");

        } else
            System.out.println(number + " is not an Armstrong number");
    }

    static int power(int n, int r) {
        int c, p = 1;
        for (c = 1; c <= r; c++) {
            p = p * n;
        }
        return p;

    }

    }

