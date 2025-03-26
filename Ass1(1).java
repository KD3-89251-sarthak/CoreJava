/*1.	Accept a integer number and when the program is executed print the binary, octal and hexadecimal equivalent of the given number. 
Sample Output: java Test 
Enter Number : 20 
Given Number :20 
Binary equivalent :10100 
Octal equivalent :24 
Hexadecimal equivalent :14  */ 

import java.util.Scanner;
public class Ass {
	public static void main(String args[]) {
		
	
	    Scanner sc= new Scanner(System.in);
	    
	   System.out.println("Enter the Number:");
	   int number = sc.nextInt();
	   
	   String binary = Integer.toBinaryString(number);
	   
	   String octal = Integer.toOctalString(number);
	   
	   String hexadecimal = Integer.toHexString(number);
	   
	   
	   System.out.println("Binary Equivalent"+ binary );
	   System.out.println("Octal Equivalent"+ octal );
	   System.out.println("Hexadecimal Equivalent"+ hexadecimal  );
	    
	    

		
		
		
	}

	
}
