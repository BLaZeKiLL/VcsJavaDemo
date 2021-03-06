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

    static int factorial(int x)
    {
        NumericFunction factorial = n -> {
            int result=1;
            for (int i = 1; i <= n; i++)
                result *= i;
            return result;
        };
        return factorial.function(x);
    }

    static <T extends Number> void output(T x)
    {
        System.out.print(x);
    }

    @SuppressWarnings("unchecked") // Checking_Input branch
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

        System.out.print("Factorial a = ");
        output(factorial((int)a.getVal()));
    }
}