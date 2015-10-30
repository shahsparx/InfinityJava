package com.company;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.Scanner;

/**
 * Created by Lenovo on 05-10-2015.
 */
public class palindromecheck {
    static Scanner input = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("What do you want to check for a palindrome? \n1.String \n2.Number");

        int option = input.nextInt();
        if (option == 1) {
            Stringpalindrome();
        } else if (option == 2) {
            Numberpalindrome();
        }
        else
            System.out.println("Invalid choice, Douchebag.");
    }

    public static void Stringpalindrome() {
        System.out.println("Enter your string and i will find if its a palindrome or not");
        String str=input.next();
        String rev = "";
        int length = str.length();
        for (int i = length - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println("The string is a palindrome");
        }
        else
            System.out.println("The entered string is not a palindrome");

    }

    public static void Numberpalindrome()
    {
        System.out.println("Enter your number and i will find if its a palindrome or not");
        int number=input.nextInt();
        int n=number;
        int rev=0,rmd;
        while(number>0)
        {
            rmd=number%10;
            rev=rev*10+rmd;
            number=number/10;

        }
        if(rev==n)
        {
            System.out.println("The number you entered is a palindrome");
        }
        else
            System.out.println("The number you entered is not a palindrome");





    }


}
