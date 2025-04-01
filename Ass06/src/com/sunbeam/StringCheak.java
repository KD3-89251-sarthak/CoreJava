package com.sunbeam;

import java.util.Scanner;

class ExceptionLineTooLong extends Exception {
    public ExceptionLineTooLong(String message) {
        super(message);
    }
}

public class StringCheak {
    public static void checkStringLength(String userInput) throws ExceptionLineTooLong {
        if (userInput.length() > 80) {
            throw new ExceptionLineTooLong("The string is too long");
        } else {
            System.out.println("String accepted. Length: " + userInput.length());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        scanner.close();
        
        try {
            checkStringLength(userInput);
        } catch (ExceptionLineTooLong e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
