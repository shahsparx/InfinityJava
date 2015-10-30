package com.company;

import java.util.Scanner;

/**
 * Created by Lenovo on 02-10-2015.
 */
public class Primesinrange {

    static int z;

    public static void main(String args[]) {
        System.out.println("Enter the lower bound of your range of numbers");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        System.out.println("Enter the upper bound of your range of numbers");
        int y = input.nextInt();

        for(int i=x;i<y;i++)
        {
            int quantity=0;
            for(int j=2;j<i;j++)
            {
               if(i%j==0)
               {
                   quantity++;
               }
            }
            if(quantity==0)
            {
                System.out.println(i+" ");
            }
        }

    }
}
