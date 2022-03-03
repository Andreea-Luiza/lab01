package com.company;

public class ExceptionAllUpper extends Exception{
    @Override
    public String getMessage()
    {
        return "toate literele sunt mari";
    }
}
