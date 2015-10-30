package com.company;

import java.util.Scanner;

/**
 * Created by Lenovo on 05-10-2015.
 */

public class stringreverse {
    static String str, reverse="";
    public static void main(String args[])
    {

        System.out.println("Enter the string that you want to reverse.");
        Scanner input=new Scanner(System.in);
        str=input.nextLine();
        System.out.println("The string you entered is " + "\"" + str + "\"");

        stringrev(str);

    }

    public static void stringrev(String c)
    {
        int length=c.length();
       for(int i=length-1;i>=0;i--)
       {
           reverse=reverse+ c.charAt(i);
       }

        System.out.println("The string in reverse is " + "\""+ reverse+ "\"");
    }
}
