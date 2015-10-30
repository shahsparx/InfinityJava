package com.company;

import java.util.Scanner;

/**
 * Created by Lenovo on 27-10-2015.
 */
public class Binaryaddition {
    public static void main(String args[])
    {
        System.out.println("Enter the two binary numbers as strings");
        Scanner input= new Scanner(System.in);

        //These two input Strings, conytaining the binary representaion of the two values.
        String x= input.nextLine();
        String y= input.nextLine();

        //Use as radix2 because its binary.
        int num1= Integer.parseInt(x,2);
        int num2= Integer.parseInt(y,2);

        int sum = num1+num2;
        System.out.println("Sum is " + Integer.toBinaryString(sum) + "=" +sum); //Converting the answer to binary.


    }
}
