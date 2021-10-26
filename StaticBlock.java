/*Program using static block*/

public class StaticBlock
{
	static int number;
	
	public static void show()
	{
		System.out.println("Static block call.....");
	}
	
	static
	{
		number = 10;
		show();
	}
	
	public static void main(String args[]) 
	{
		System.out.println("This is main method.....");
	}
}