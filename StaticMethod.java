/*Program using static methods*/

import java.util.Scanner;

class Test
{
	static int numberOne;
	static int numberTwo;
	static int addition;
		
	static void Display() //Static method accesses only static variables
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your first number : ");
		numberOne = scanner.nextInt();
		
		System.out.println("Enter your second number : ");
		numberTwo = scanner.nextInt();
		
		addition = numberOne + numberTwo;
		System.out.println("Answer is : "+addition);
	}
}

public class StaticMethod
{
	public static void main(String args[])
	{
	    Test test = new Test();
		test.Display();
	}
}
