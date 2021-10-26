/*Program using Set Concept*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class SetConcept
{
	public static void main(String args[])
	{
		//Set do not contains duplicate values
		Set <String> data = new LinkedHashSet <String> ();   //if we want int value then use Integer
    
        data.add("Vishal");   
        data.add("Prajapati");   
        data.add("ABC");   
        data.add("Vishal");   
    
        System.out.println(data); //print data 
		
		System.out.println(data.contains("Vishal")); //if vishal is in set it returns true otherwise false
		System.out.println(data.containsAll(data)); 
		
		/*we can clear set values using clear*/
		//data.clear();
		//System.out.println(data);
		
		/*We can print set using array*/
		Object[] array_data = data.toArray();   
        System.out.println("The array is:");   
        for (int i = 0; i < array_data.length; i++)
		{			
            System.out.println(array_data[i]);
		}

		/*Using iterator*/
		Iterator newData = data.iterator();  
        System.out.println("The New data values are : ");   
        while (newData.hasNext()) 
		{   
            System.out.println(newData.next());   
		}
	}
}