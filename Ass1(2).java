/*
2)Accept 2 double values from User (using Scanner). Check data type. If arguments are not doubles, 
supply suitable error message & terminate.
If numbers are double values, print its average. */


import java.util.Scanner;

public class Sun {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		
	
		if(!sc.hasNextDouble())
		{
		    System.out.println("Error; Invalid input");	
		}
		
		double num1 = sc.nextDouble();		
		
		System.out.println("Enter second number");
		if(!sc.hasNextDouble())
		{
			System.out.println("Error Please enter valid double input");
		}
		
		
			double num2 = sc.nextDouble();
		
		
		double average = (num1+num2)/2;
		
		System.out.print("Average is:" + average);	
			
}
}