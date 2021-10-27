/*Program to find index of an array element*/

import java.util.Scanner;

public class FindIndexOfArray
{
	public static void main(String args[])
	{
		int[] array = new int[10];
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter how many elements you want : ");
		int number = scanner.nextInt();
		
		for(int i = 0 ; i < number ; i++)
		{
			array[i] = scanner.nextInt();
		}
		
		System.out.println("Array Elements are : ");
		
		for(int i = 0 ; i < number ; i++)
		{
			System.out.println(array[i]);
		}
		
		System.out.println("Enter an element which you want index of that element : ");
		
		int element = scanner.nextInt();
		int index = -1;
		
		for(int i = 0 ; i < number ; i++)
		{
			if(array[i] == element)
			{
				index = i;
				break;
			}
		}
		
		System.out.println("Index number is : "+index);
	}
}
