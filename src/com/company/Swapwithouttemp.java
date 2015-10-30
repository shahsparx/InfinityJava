package com.company;
import java.util.Scanner;

/**
 * Created by Lenovo on 02-10-2015.
 */
public class Swapwithouttemp {
    public static void main(String args[]) {
        System.out.println("Enter the first number to be swapped");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println("Enter the second number now");
        int y = input.nextInt();
        System.out.println("Before swapping, x=" + x + "And y=" + y);
        swapp(x, y);
    }
        public static void swapp (int a, int b)
        {
            a=a+b;
            b=a-b;
            a=a-b;
            System.out.println("After swapping, x="+a+"And y="+b);
        }


}
