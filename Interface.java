/*Program to implement interface*/

interface InterfaceOne
{
	public void Show();
}

interface InterfaceTwo
{
	public void Display();
}

class Interface implements InterfaceOne,InterfaceTwo
{
	public void Show()
	{
		System.out.println("This is interface 1 ....");
	}
	
	public void Display()
	{
		System.out.println("This is interface 2 .....");
	}
	
	public static void main(String args[])
	{
		Interface interfacee=new Interface();
		interfacee.Show();
		interfacee.Display();
	}
}