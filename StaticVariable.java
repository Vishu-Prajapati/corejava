/*Program Using Static Variables*/

class Employee
{
	int employeeId;
	float salary;
	String name;
	static String companyName = "QdevTechnolab";
	
	Employee()
	{
		
	}
	
	Employee(int employeeId1,float salary1,String name1)
	{
		this.employeeId = employeeId1;
		this.salary = salary1;
		this.name = name1;
	}
	
	void display()
	{
		System.out.println(employeeId);
		System.out.println(salary);
		System.out.println(name);
		System.out.println(companyName);
	}
}
public class StaticVariable
{
	public static void main(String args[])
	{	
		Employee e1 = new Employee(101 ,1000 ,"Vishal");
		e1.display();
		
		Employee e2 = new Employee(102 ,2000 ,"Nitesh");
		e2.display();
	}
}