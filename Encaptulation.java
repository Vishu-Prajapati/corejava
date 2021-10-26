/*Program using encaptulation*/

class Encaptulate
{
	private int rollNo;
	private String name;
	private int age;
		
	public int getRollNo()
	{
		return rollNo;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
		
	public void setRollNo(int newRollNo)
	{
		rollNo=newRollNo;
	}
	
	public void setName(String newName)
	{
		name=newName;
	}
	
	public void setAge(int newAge)
	{
		age=newAge;
	}
}

public class Encaptulation
{
	public static void main(String args[])
	{
		Encaptulate e=new Encaptulate();
		e.setRollNo(101);
		e.setName("Vishal");
		e.setAge(20);
		
		System.out.println("Roll number is : "+e.getRollNo());
		System.out.println("Name is : "+e.getName());
		System.out.println("Age is : "+e.getAge());
	}
}
