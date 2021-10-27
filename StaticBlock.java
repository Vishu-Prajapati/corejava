/*Program using static block*/

public class StaticBlock
{
	static int number;
	
	public static void Show()
	{
		System.out.println("Static block call.....");
	}
	
	static
	{
		number = 10;
		Show();
	}
	
	public static void main(String args[]) 
	{
		System.out.println("This is main method.....");
	}
}