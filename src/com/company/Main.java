package com.company;

import java.util.*;

@SuppressWarnings("WeakerAccess")
public class Main
{
    static void line()
    {
        System.out.println();
    }

    static double add(double a, double b)
    {
        return a+b;
    }

    static double subtract(double a, double b)
    {
        return a-b;
    }

    static double multiply(double a, double b)
    {
        return a*b;
    }

    static double divide(double a, double b)
    {
        return a/b;
    }

    static <T extends Number> void output(T x)
    {
        System.out.print(x);
    }

    @SuppressWarnings("unchecked") // assumed input is a number no checking
    static <T extends Number> T input()
    {
        System.out.println("Enter a no.");
        Scanner sc = new Scanner(System.in);
        return (T) new Double(sc.nextDouble());
    }

    public static void main(String[] args)
    {
	    System.out.println("Supp people ??");

	    Variable a = new Variable(input());
	    Variable b = new Variable(input());

        System.out.print("Add = ");
        output(add(a.getVal(),b.getVal()));line();

        System.out.print("Subtract = ");
        output(subtract(a.getVal(),b.getVal()));line();

        System.out.print("Multiply = ");
        output(multiply(a.getVal(),b.getVal()));line();

        System.out.print("Divide = ");
        output(divide(a.getVal(),b.getVal()));line();
    }
}
