package com.company;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Lenovo on 10-11-2015.
 */

public class StackInro2 {

    static void spush(Stack st,String a)
    {
        st.push(new String(a));
        System.out.println("pushing String " + a);
        System.out.println("Stack is now" + st);
    }

    static void spop(Stack st)
    {
        System.out.print("Popping String ");
        String a = (String) st.pop();
        System.out.println("Stack is now" + st);
    }

    static void inputintostack(){

    }

    public static void main(String a[])
    {
        Stack st = new Stack<>();
        Scanner input = new Scanner(System.in);
        String R;
        do {
            System.out.println("Enter your strings to be pushed one by one.");
            String p = input.nextLine();
            spush(st, p);

            System.out.println("Want to enter more strings? (Y/N)");
            R=input.nextLine();
        }while (R.equals("Y")||R.equals("y"));
    }

    }
