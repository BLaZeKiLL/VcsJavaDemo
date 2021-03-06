package com.company;

public class Variable
{
    private double val;

    <T extends Number> Variable(T val)
    {
        this.val=val.doubleValue();
    }

    public double getVal()
    {
        return val;
    }

    @Override
    public String toString()
    {
        return String.valueOf(val);
    }
}
