package com.company;

/**
 * Created by Lenovo on 27-10-2015.
 */
public class Decimaltobinary {
    public void convertBinary(int num)
    {
        int binary[] = new int[40];
        int index= 0;
        while(num>0)
        {
            binary[index++] = num%2;
            num = num/2;
        }

        for(int i = index-1;i>=0;i--)
        {
            System.out.print(binary[i]);
        }
    }

    public static void main(String a[])
    {
        Decimaltobinary obj = new Decimaltobinary();
        System.out.println("Binary representation of 14 is " );
        obj.convertBinary(14);
    }

}

