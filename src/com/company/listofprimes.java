package com.company;

import java.util.Scanner;

/**
 * Created by Lenovo on 27-10-2015.
 *
 * This method does show some really incorrect outputs.
 */
public class listofprimes {

static int z;

    public static void main(String args[]) {
        System.out.println("Enter the lower bound of your range of numbers");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        System.out.println("Enter the upper bound of your range of numbers");
        int y = input.nextInt();

        for(int i=x;i<y;i++)
        {
            if((Math.pow(7,i-1))%i==1||i==7)
            {
                System.out.println(i+ "\n");
            }
        }

    }
}

