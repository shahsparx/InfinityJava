package com.company;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Lenovo on 27-10-2015.
 */
public class Binaryadditionusingstack {
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        //Create stack object
        Stack<Integer> stack = new Stack<Integer>();

        //User input
        System.out.println("Enter decimal number");
        int num = in.nextInt();

        while (num!=0)
        {
            int d= num%2;
            stack.push(d);
            num/=2;
        }
        System.out.print("Binary representaion is : ");
        while(!(stack.isEmpty()))
        {
            System.out.print(stack.pop());
        }
        System.out.println();
    }

}
