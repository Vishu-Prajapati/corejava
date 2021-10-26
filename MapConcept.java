/*Program using Map Concept*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class MapConcept
{
	public static void main(String args[])
	{
		Map <Integer,String> map = new HashMap <Integer,String> ();  
		
		map.put(100,"Vishal");  
		map.put(101,"Nitesh");  
		map.put(105,"Yogesh");  
		map.put(102,"Vikash"); 

		for(Map.Entry m1 : map.entrySet())
		{  
			System.out.println(m1.getKey() + "-" + m1.getValue());
		}
	}
}