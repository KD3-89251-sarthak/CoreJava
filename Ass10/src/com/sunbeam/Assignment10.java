package com.sunbeam;

import java.util.IntSummaryStatistics;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Assignment10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q1: Factorial of a number using streams
        System.out.println("Enter the number to calculate factorial:");
        int number = sc.nextInt();
        int factorial = Stream.iterate(1, i -> i + 1)
                              .limit(number)
                              .reduce(1, (a, i) -> a * i);
        System.out.println("Factorial of " + number + " is: " + factorial);

        // Q2: Sum of integers using streams
        System.out.println("\nEnter the number to calculate sum up to that number:");
        number = sc.nextInt();
        int sum = Stream.iterate(1, i -> i + 1)
                        .limit(number)
                        .reduce(0, (a, i) -> a + i);
        System.out.println("Sum of first " + number + " numbers is: " + sum);

        // Q3: IntStream from 1 to 10 and various functions
        IntStream intStream = IntStream.rangeClosed(1, 10);

        int streamSum = intStream.sum(); // sum() is terminal, so recreate the stream for stats
        System.out.println("\nSum using IntStream (1 to 10): " + streamSum);

        IntSummaryStatistics stats = IntStream.rangeClosed(1, 10).summaryStatistics();
        System.out.println("Summary Statistics for 1 to 10:");
        System.out.println("Count: " + stats.getCount());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Sum: " + stats.getSum());

        sc.close();
    }
}
