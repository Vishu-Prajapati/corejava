/*Program using Hierchical inheritance*/

class ParentOne
{
	void ShowOne()
	{
		System.out.println("This is parent class...");
	}
}

class ChildOne extends ParentOne
{
	void ShowTwo()
	{
		System.out.println("This is child 1 class...");
	}
}

class ChildTwo extends ParentOne
{
	void ShowThree()
	{
		System.out.println("This is child 2 class...");
	}
}

class ChildThree extends ParentOne
{
	void ShowFour()
	{
		System.out.println("This is child 4 class...");
	}
}

public class HierchicalInheritance
{
	public static void main(String args[])
	{
		ChildOne childOne = new ChildOne(); //using childOne class object
		childOne.ShowOne();
		
		ChildTwo childTwo = new ChildTwo(); //using childTwo class object
		childTwo.ShowOne();
		
		ChildThree childThree = new ChildThree(); //using childThree class object
		childThree.ShowOne();
	}
}
