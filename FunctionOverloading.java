/*Program using polymorphism Function overloading*/

class Adder
{  
	static int Addition(int numberOne,int numberTwo)
	{
		return numberOne + numberTwo;
	}  
	static int Addition(int numberOne,int numberTwo,int numberThree)
	{
		return numberOne + numberTwo + numberThree;
	}  
}  
class FunctionOverloading
{  
	public static void main(String[] args)
	{  
		System.out.println(Adder.Addition(10,20));  
		System.out.println(Adder.Addition(10,20,30));   
	}
}  