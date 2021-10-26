/*Program using encaptulation*/

class Encaptulate
{
	private int rollNo;
	private String name;
	private int age;
		
	public int GetRollNo()
	{
		return rollNo;
	}
	
	public String GetName()
	{
		return name;
	}
	
	public int GetAge()
	{
		return age;
	}
		
	public void SetRollNo(int newRollNo)
	{
		rollNo=newRollNo;
	}
	
	public void SetName(String newName)
	{
		name=newName;
	}
	
	public void SetAge(int newAge)
	{
		age=newAge;
	}
}

public class Encaptulation
{
	public static void main(String args[])
	{
		Encaptulate e=new Encaptulate();
		encaptulate.SetRollNo(101);
		encaptulate.SetName("Vishal");
		encaptulate.SetAge(20);
		
		System.out.println("Roll number is : "+encaptulate.GetRollNo());
		System.out.println("Name is : "+encaptulate.GetName());
		System.out.println("Age is : "+encaptulate.GetAge());
	}
}
