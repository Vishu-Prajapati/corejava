//Program Using Static Blocks,Methods and Variables

public class demo
{
	static
	{
		System.out.println("This is static block");
	}
}
class prac12
{
	int emp_id;
	float salary;
	String name;
	static String company_name="QdevTechnolab";
	
	prac12()
	{
		
	}
	prac12(int emp_id1,float salary1,String name1)
	{
		this.emp_id=emp_id1;
		this.salary=salary1;
		this.name=name1;
	}
	void display()
	{
		System.out.println(emp_id);
		System.out.println(salary);
		System.out.println(name);
		System.out.println(company_name);
	}
	
	public static void main(String args[])
	{
		prac12 p=new prac12(101,1000,"Vishal");
		p.display();
		prac12 p1=new prac12(102,2000,"Nitesh");
		p1.display();
	}
}