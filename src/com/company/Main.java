package com.company;

import java.util.*;

@SuppressWarnings("WeakerAccess")
public class Main
{
    static void line()
    {
        System.out.println();
    }

    static int add(int a,int b)
    {
        return a+b;
    }

    static int subtract(int a,int b)
    {
        return a-b;
    }

    static int multiply(int a,int b)
    {
        return a*b;
    }

    static void output(int x)
    {
        System.out.print(x);
    }

    static int input()
    {
        System.out.println("Enter a no.");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void main(String[] args)
    {
	    System.out.println("Supp people ??");

	    int a = input();
	    int b = input();

        System.out.print("Add = ");
        output(add(a,b));line();

        System.out.print("Subtract = ");
        output(subtract(a,b));line();

        System.out.print("Multiply = ");
        output(multiply(a,b));line();

    }
}
