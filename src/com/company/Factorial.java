package com.company;
import java.util.Scanner;

/**
 * Created by Lenovo on 02-10-2015.
 */
public class Factorial {
    public static void main(String args[])
    {
        System.out.println("Enter the number to find it's factorial");
        Scanner input= new Scanner(System.in);
        int x= input.nextInt();
        facto(x);

    }
    public static void facto(int a)
    {
        if(a>0)
        {
            for (int i = a - 1; i >= 1; i = i - 1) {
                a = a * i;
            }
            System.out.println("Factorial is " + a);
        }

        else if(a==0)
        {
            System.out.println("Factorial is " + 1);
        }

        else
            System.out.println("Factorial is undefined for negative numbers");
    }

}
