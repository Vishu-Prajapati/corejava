class WrapperClass
{
	public static void main(String args[])
	{
		/*Program to compare two variable using wrapper class*/
		
		int i = 10;
		int i1 = 10;
		
		/*For int datatype wrapper class is Integer
		  For float datatype wrapper class is Float
		  For boolean datatype wrapper class is Boolean
		  .....
		  .....
		*/
		
		Integer intobj = i;
		System.out.println("Interger object : "+intobj);
		
		Integer intobj1 = i1;
		System.out.println("Interger object : "+intobj1);
		
		if(intobj == intobj1)
		{
			System.out.println("its value is same...");
		}
		else
		{
			System.out.println("its value is not same...");
		}
	}
	
}
