import java.util.*;
import java.lang.*;

public class Pattern
{
	public static void main(String args[])
	{
		/*Program to implement pattern*/
		
		for(int i = 0 ; i <= 5 ; i++)
		{
			for(int j = 0 ; j < i ; j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}