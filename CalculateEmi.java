public class CalculateEmi
{
	/*Program to Calculate EMI*/
	
	double amount;
	double interest;
	double time;
	
	CalculateEmi()
	{
		
	}
	
	CalculateEmi(double amount, double interest, double time)
	{
		this.amount = amount;
		this.interest = interest;
		this.time = time;
	}
	
	void CalculateEmiDisplay()
	{
		interest = interest / ( 12 * 100 ); 
        time = time * 12; 
      
		double emi = ( amount * interest * Math.pow ( 1 + interest , time ) ) / ( Math.pow ( 1 + interest , time ) - 1);

		System.out.println("Calculated Emi is : "+emi);
	}
	
	public static void main(String args[])
	{
		CalculateEmi calculateEmi = new CalculateEmi(2000.00,20,2);
		calculateEmi.CalculateEmiDisplay();
	}
}
		
	
