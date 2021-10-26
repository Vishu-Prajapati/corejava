/*Program using static methods*/



import java.util.*;
import java.lang.*;

public class static block 
{
	System.out.println("i am khan");
}

class Test
{
	static int numberOne = 10;
	static int numberTwo = 20;
	static int addition;
		
	static void display() //Static method accesses only static variables
	{
		addition = numberOne + numberTwo;
		System.out.println("Answer is : "+addition);
	}
}

public class StaticMethod
{
	public static void main(String args[])
	{
	    Test t = new Test();
		t.display();
	}
}