public class BreakContinueStatment
{
	public static void main(String args[])
	{
		/*Program using Break and Continue statments*/
		
		int number = 1;
		
		for(number =0 ; number <= 10 ; number++)
		{
			if (number == 7)
			{
				continue; //If we use break statment then loop terminate after 6 number
			}
			System.out.println(number);
		}		
	}
}