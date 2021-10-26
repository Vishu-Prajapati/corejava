/*Program using function overriding*/

class TestOne
{
	void Display()
	{
		System.out.println("This is display method....");
	}
}

class TestTwo extends TestOne
{
	void Display()
	{
		System.out.println("This is overridden display method....");
	}
}

public class FunctionOverriding
{
	public static void main(String args[])
	{
		TestTwo testTwo = new TestTwo();
		testTwo.Display(); //this display overidden method
	}
}