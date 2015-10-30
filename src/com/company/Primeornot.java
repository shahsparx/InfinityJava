package com.company;

import java.util.Scanner;

/**
 * Created by Lenovo on 27-10-2015.
 *
 * This method does show some really incorrect outputs.
 */
public class Primeornot {
    public static void main(String args[])
    {
        System.out.println("Enter your number and i will tell you if its a prime or composite number");
        Scanner input =new Scanner(System.in);
        int num=input.nextInt();
        if((Math.pow(7,num-1))%num==1||num==7||num==1)
        {
            System.out.println(num + " is prime");
        }
        else if(num==6)
        {
            System.out.println(num + " is composite");
        }
        else
            System.out.println(num + " is composite");
    }
}
