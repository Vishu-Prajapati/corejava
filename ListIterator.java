/*Program to add string values in the list and print all the values using an iterator*/

import java.util.ArrayList;
import java.util.Iterator;

public class ListIterator
{
	public static void main(String args[])
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("World");
		list.add("Vishal");
		list.add("Prajapati");
		list.add("Qdev");
		
		Iterator<String> itr = list.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
	}
}
