package com.UserReg.UC3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static final Scanner scanner = new Scanner(System.in);

    public static void validFirstName(){
        	System.out.print("\nEnter First Name: ");
        String name = scanner.next();
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(name);
        boolean r = m.matches();
        if (r)
            System.out.println("\nFirst Name is Valid");
        else
            System.out.println("\nFirst Name is Invalid");
    	}
    public static void validLastName(){
        	System.out.print("\nEnter Last Name: ");
        String name = scanner.next();
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(name);
        boolean r = m.matches();
        if (r)
            System.out.println("\nLast Name is Valid");
        else
            System.out.println("\nLast Name is Invalid");
    }
    public static void validEmail() {
        	System.out.println("\nEnter the Email ID: ");
        String email = scanner.next();
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(email);
        boolean r = m.matches();
        if (r)
            System.out.println("\nEmail is Valid");
        else
            System.out.println("\nEmail is Invalid");
    }
}