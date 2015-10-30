package com.company;

import java.util.Scanner;

/**
 * Created by Lenovo on 05-10-2015.
 */
public class Bubblesort {
    public static void main(String args[])
    {
        int n,c,d,swap;
        Scanner input=new Scanner(System.in);
        System.out.println("Input number of integers to sort.");
        n= input.nextInt();

        int array[]= new int[n];

        System.out.println("Enter" + n + "Integers");

        for(c=0;c<n;c++) {
            array[c] = input.nextInt();
        }

        for(c=0;c<(n-1);c++)
            for(d=0;d<n-c-1;d++)
                if (array[d]>array[d+1])
                {
                    swap = array[d];
                    array[d]=array[d+1];
                    array[d+1]=swap;

                }
        System.out.println("Sorted list of numbers");

        for(c=0;c<n;c++)
        {
            System.out.println(array[c]);
        }
    }
}
