import java.lang.String;

class StringsMethod
{
	public static void main(String args[])
	{
		/*Program using concat(),equals(),charAt() methods*/
		
		/*strings concatination concat() method*/
		
		String string1 = "Vishal";
		String string2 = "Prajapati";
		
		String answer = string1.concat(string2); //This concat() method concat two strings
		System.out.println("After concatination..."+answer);
		
		String str1 = new String("Nitesh");
		String str2 = new String("Ronak");
		String answer1 = String.join(" and " , str1 , str2);
		System.out.println(answer1.toString());
		
		/*String equals() methods*/
		
		if(string1.equals(string2)) //This equals() method check strings are same or not
		{
			System.out.println("Yes both strings are same");
		}
		else
		{
			System.out.println("No both strings are not same");
		}
		
		/*String charAt() methods*/
		
		char ch=string1.charAt(3); //This charAt() method shows character of particular index
		System.out.println("Specific Character is : "+ch);
		
	}
}
