package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Testare");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Scrieti textul:");
        String txt= scanner.nextLine();

        try{
            if(txt.toLowerCase()==txt){
                throw new ExceptionAllLower();
            }else if(txt.toUpperCase()==txt){
                throw new ExceptionAllUpper();
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(txt);
    }
}
