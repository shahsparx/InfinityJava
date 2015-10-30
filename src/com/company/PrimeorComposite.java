package com.company;
import java.util.Scanner;

/**
 * Created by Lenovo on 30-09-2015.
 */
public class PrimeorComposite {
    public static void main(String args[])
    {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number");
        int x= input.nextInt();
        int quantity=0;
        int divisor=0;
        for(int i=2;i<x;i++)
            {
                    if(x%i==0)
                        {
                            quantity++;
                            divisor=i;
                            System.out.println("The number is composite, its divisors are"+ divisor);

                        }
            }
            if(quantity>=1)
            {
                System.out.println("There are a total of "+quantity+" divisors");

            }
            if(quantity<1)
            {
                System.out.println("The number is a prime");

            }
        }
    }
