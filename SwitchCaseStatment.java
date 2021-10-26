import java.lang.*;
import java.util.*;

public class SwitchCaseStatment 
{
	public static void main(String args[])
	{
		/*Program using Switch case statments*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter month in digit : ");
		int choice = sc.nextInt();
	
		switch(choice)
		{
			case 1 : if(choice == 1)
				     {
						 System.out.println("January is the name of "+choice);
					 }
					 break;
					 
			case 2 : if(choice == 2)
				     {
						 System.out.println("February is the name of "+choice);
					 }
					 break;
					 
			case 3 : if(choice == 3)
				     {
						 System.out.println("March is the name of "+choice);
					 }
					 break;
					 
			case 4 : if(choice == 4)
				     {
						 System.out.println("April is the name of "+choice);
					 }
					 break;
					 
			case 5 : if(choice == 5)
				     {
						 System.out.println("May is the name of "+choice);
					 }
					 break;
			case 6 : if(choice == 6)
				     {
						 System.out.println("June is the name of "+choice);
					 }
					 break;
					 
			case 7 : if(choice == 7)
				     {
						 System.out.println("July is the name of "+choice);
					 }
					 break;
					 
			case 8 : if(choice == 8)
				     {
						 System.out.println("August is the name of "+choice);
					 }
					 break;
					 
			case 9 : if(choice == 9)
				     {
						 System.out.println("September is the name of "+choice);
					 }
					 break;
					 
			case 10 : if(choice == 10)
				     {
						 System.out.println("October is the name of "+choice);
					 }
					 break;
					 
			case 11 : if(choice == 11)
				     {
						 System.out.println("November is the name of "+choice);
					 }
					 break;
					 
			case 12 : if(choice == 12)
				     {
						 System.out.println("December is the name of "+choice);
					 }
					 break;
					 
			default  : System.out.println("Enter Proper Value....");
		}
	}
}
