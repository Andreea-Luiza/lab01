package com.company;

public class ExceptionAllLower extends Exception{
    @Override
    public String getMessage()
    {
        return "toate literele sunt mici";
    }
}
