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
	
	void Display()
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
		Employee employee = new Employee(101 ,1000 ,"Vishal");
		employee.Display();
		
		Employee employee = new Employee(102 ,2000 ,"Nitesh");
		employee.Display();
	}
}
