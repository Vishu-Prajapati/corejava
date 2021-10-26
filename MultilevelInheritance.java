/*Program using inheritance Multilevel inheritance*/

class TestOne
{
	void ShowOne()
	{
		System.out.println("This is first class...");
	}
}

class TestTwo extends TestOne
{
    void ShowTwo()
	{
		System.out.println("This is second class...");
	}
}

class TestThree extends TestTwo
{
	void ShowThree()
	{
		System.out.println("This is third class...");
	}
}

public class MultilevelInheritance
{
    public static void main(String args[])
	{
		TestThree testThree = new TestThree();
		testThree.ShowOne();
		testThree.ShowTwo();
		testThree.ShowThree();
	}
}