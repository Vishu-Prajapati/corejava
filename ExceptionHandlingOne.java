/*Program Using throw and throws keyword*/

import java.lang.*;
import java.util.*;
import java.io.*;

class ExceptionHandlingOne
{
	void sum() throws InputMismatchException
	{
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter your first number : ");
		int numberOne=scanner.nextInt();
		
		System.out.println("Enter your second number : ");
		int numberTwo=scanner.nextInt();
			
		int answer = numberOne + numberTwo;
		
		System.out.println("Answer is : "+answer);
		
		if(answer==0)
		{
			throw new NullPointerException("not valid"); // we can also apply throw inside method or code..
		}
	}
	
	public static void main(String args[])
	{
		ExceptionHandlingOne exceptionHandlingOne=new ExceptionHandlingOne();
		exceptionHandlingOne.sum();
	}
}