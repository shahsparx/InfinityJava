package com.company;
import java.util.Scanner;
/**
 * Created by Lenovo on 30-09-2015.
 */
public class OddorEven {
    public static void main(String args[])
    {
      System.out.println("Hey there! \n Enter your number and I will tell you, if its odd/even");
       Scanner input= new Scanner(System.in);
        int a=input.nextInt();
        if(a%2==0)
        {
            System.out.println("Your number is even");
        }
        else
        {
            System.out.println("Your number is odd");
        }
    }
}
