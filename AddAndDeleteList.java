/*Create a list and delete duplicate value in the list*/

import java.lang.*;
import java.util.*;

public class AddAndDeleteList
{
	public static void main(String args[])
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("A");
		list.add("C");
		list.add("E");
		list.add("E");
		list.add("E");
		System.out.println("Original List : "+list);
		
	    Object[] st = list.toArray();
		
        for (Object s : st) 
		{
			if (list.indexOf(s) != list.lastIndexOf(s)) 
			{
				list.remove(list.lastIndexOf(s));
			}
        }
		
		System.out.println("Remove Dublicate : "+list);
	}
}