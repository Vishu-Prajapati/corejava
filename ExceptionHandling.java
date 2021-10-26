/*Exception using try ,catch ,finally*/

import java.lang.*;
import java.util.*;
import java.io.*;

 class ExceptionHandling 
 {
	 public static void main(String args[])
	 {
		 Scanner scanner=new Scanner(System.in);
		 
		 System.out.println("Enter your first number : ");
		 int numberOne = scanner.nextInt();
		 
		 System.out.println("Enter your second number : ");
		 int numberTwo = scanner.nextInt();
		 
		 try
		 {
			int divison = numberOne / numberTwo;
			
			System.out.println("Division is : "+divison);
			System.out.println("try block called...");
		 }
		 catch(Exception e) 
		 {
			 System.out.println("catch block called...");

			 if(numberTwo == 0)
			 {
				 System.out.println("Number can not divide by 0");
			 }
		 }
		 finally
		 {
			 System.out.println("final block called");
		 }
	 }
 }