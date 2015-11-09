package com.company;
import java.util.*;

/**
 * Created by Lenovo on 10-11-2015.
 */
public class StackIntro {

    static void showpush(Stack st, int a)
    {
        st.push(new Integer(a));
        System.out.println("push(" + a + ")" );
        System.out.println("stack:" + st);
    }

    static void showpop(Stack st)
    {
        System.out.print("pop ->");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        System.out.println("stack: " + st);
    }

    public static void main(String a[])
    {
        Stack st = new Stack();
        System.out.println("stack :" + st);
        showpush(st,42);
        showpush(st,66);
        showpush(st,99);
        System.out.println("Element at 1 is :" + st.get(1));
        showpop(st);
        showpop(st);
        showpop(st);

        try{
            showpop(st);
        }catch (EmptyStackException e){
            System.out.println("Empty stack Nigga.");
        }
    }
}
