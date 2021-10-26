/*Program using inheritance Single inheritance*/

class TestOne
{
	void Display()
	{
		System.out.println("This is parent class....");
	}
}

class TestTwo extends TestOne
{
	void Show()
	{
		System.out.println("This is child class....");
	}
}
public class SingleInheritance
{
	public static void main(String args[])
	{
		TestTwo testTwo = new TestTwo();
		testTwo.Display();
		testTwo.Show();
	}
}