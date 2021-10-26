import java.lang.*;
import java.util.*;

class CalculateEmi
{
	/*Program to Calculate EMI*/
	
	void calculateEmi()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your amount : ");
		float amount = sc.nextFloat();
		
		System.out.println("Enter your interest : ");
		float interest = sc.nextFloat();

		System.out.println("Enter your time in year : ");
		float time = sc.nextFloat();
		
		interest = interest / ( 12 * 100 ); 
        time = time * 12; 
      
		double emi = ( amount * interest * Math.pow ( 1 + interest , time ) ) / ( Math.pow ( 1 + interest , time ) - 1);

		System.out.println("Calculated Emi is : "+emi);
	}
	public static void main(String args[])
	{
		CalculateEmi c=new CalculateEmi();
		c.calculateEmi();
	}
}