/*Program using inheritance Hybrid inheritance*/

class Wheeler
{
	void Display()
	{
		System.out.println("This is wheeler class...");
	}
}

class TwoWheeler extends Wheeler
{
	void Display()
	{
		System.out.println("This is two wheeler class...");
	}
}

class Activa extends TwoWheeler
{
	void Display()
	{
		System.out.println("This is Activa class...");
	}
}

class MotorCycle extends TwoWheeler
{
	void Display()
	{
		System.out.println("This is Motocycle class...");
	}
}

public class HybridInheritance
{
	public static void main(String args[])
	{
		MotorCycle motorCycle = new MotorCycle();
		motorCycle.Display();
	}
}
