package com.company;

import java.util.*;

@SuppressWarnings("WeakerAccess")
public class Main
{

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
        return a/b;
    }

    static void output(int x)
    {
        System.out.print(x);
    }

    static int input()
    {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void main(String[] args)
    {
	    System.out.println("Supp people ??");

	    int a = input();
	    int b = input();

        System.out.println("add = " + add(a,b) + " subtract = " + subtract(a,b) + " multiply = " + multiply(a,b));
    }
}
