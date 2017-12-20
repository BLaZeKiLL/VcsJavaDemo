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

    static double divide(int a,int b)
    {
        return (double)a/b;
    }

    static <T extends Number> void output(T x)
    {
        System.out.print(x);
    }

    @SuppressWarnings("unchecked")
    static <T extends Number> T input()
    {
        System.out.println("Enter a no.");
        Scanner sc = new Scanner(System.in);
        return (T) new Double(sc.nextDouble());
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

        System.out.print("Divide = ");
        output(divide(a,b));line();
    }
}
