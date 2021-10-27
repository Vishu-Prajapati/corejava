/*Program using Data Abstraction*/

import java.util.Scanner;

abstract class TestOne
{
	abstract void Calculate();
}

class TestTwo extends TestOne
{
	void Calculate()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter value of number 1 : ");
		int numberOne = sc.nextInt();
		
		System.out.print("Enter value of number 2 : ");
		int numberTwo = sc.nextInt();
		
		double multiplication = numberOne * numberTwo;
		
		System.out.println("Multiplication is : "+multiplication);
	}
}

public class Abstraction
{
	public static void main(String args[])
	{
		TestTwo testTwo=new TestTwo();
		testTwo.Calculate();
	}
}
