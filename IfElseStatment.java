import java.util.*;

public class IfElseStatment
{
	/*Program using if else statments*/
	
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your Age : ");
		int age = scanner.nextInt();
		
		if(age == 20)
		{
			System.out.println("Yes I am 20 years old");
		}
		else
		{
			System.out.println("No This is not my age");
		}
	}
}
