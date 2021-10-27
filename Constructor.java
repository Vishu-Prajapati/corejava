public class Constructor
{
	/*Program using constructor and parameterized constructor*/
	
	int numberOne;
	int numberTwo;
	
	Constructor()
	{
		System.out.println("This is default constructor call");
	}
	
	Constructor(int numberOne1,int numberTwo2)
	{
		this.numberOne = numberOne1;
		this.numberTwo = numberTwo2;
		
		System.out.println("This is parameterized constructor call");
	}
	
	void Calculate()
	{
		int addition = numberOne + numberTwo;
		System.out.println("Addition is : "+addition);
	}
	
	public static void main(String args[])
	{
		Constructor constructor=new Constructor(10,20); //If we dont pass any value in argument then default constructor will call
		constructor.Calculate();
	}
}
