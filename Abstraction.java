/*Program using Data Abstraction*/

import java.util.*;

abstract class Test1
{
	abstract void calculate();
}

class Test2 extends Test1
{
	void calculate()
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
		Test2 t=new Test2();
		t.calculate();
	}
}
