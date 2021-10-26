/*Program using virtual function*/

class TestOne
{
	void Display()
	{
		System.out.println("This is Parent class...");
	}
}

class TestTwo extends TestOne
{
	void Display()
	{
		System.out.println("This is Child class...");
	}
}

public class VirtualFunction
{
	public static void main(String args[])
	{
		TestOne testOne=new TestTwo();
		testOne.Display();
	}
}