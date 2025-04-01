package com.sunbeam;

import java.util.Scanner;

public class Assignment5
{
    
    // Q1: Reverse a String using a for loop
    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
    
    // Q2: Check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("\\s", ""); // Remove spaces and convert to lowercase
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    
    // Q3: Count number of words in a string
    public static int countWords(String str) {
        str = str.trim(); // Remove leading and trailing spaces
        if (str.isEmpty()) {
            return 0;
        }
        int wordCount = 1; // Start with 1 assuming there's at least one word
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                wordCount++;
            }
        }
        return wordCount;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Reversed String
        System.out.println("Reversed String: " + reverseString(input));
        
        // Palindrome check
        System.out.println("Is Palindrome: " + isPalindrome(input));
        
        // Word count
        System.out.println("Word Count: " + countWords(input));
        
        scanner.close();
    }
}

