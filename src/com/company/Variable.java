package com.company;

public class Variable
{
    private double val;

    public <T extends Number> Variable(T val)
    {
        this.val=val.doubleValue();
    }

    public double getVal()
    {
        return val;
    }
}
