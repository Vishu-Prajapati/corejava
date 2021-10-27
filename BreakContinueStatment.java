public class BreakContinueStatment
{
	public static void main(String args[])
	{
		/*Program using Break statment*/
		
		System.out.println("===Break Statment===");
		
		for(int numberOne = 0 ; numberOne <= 10 ; numberOne++)
		{
			if (numberOne == 7)
			{
				break; //If we use break statment then loop terminate after 6 number
			}
			System.out.println(numberOne);
		}

		System.out.println();
		
		/*Program using Continue statment*/
		
		System.out.println("===Continue Statment===");
		
		for(int numberTwo = 0 ; numberTwo <= 10 ; numberTwo++)
		{
			if (numberTwo == 4)
			{
				continue; //If we use continue statment then loop then it skips 4 and then continue 
			}
			System.out.println(numberTwo);
		}
	}
}
