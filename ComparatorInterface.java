/*Program using Comparator Interface*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student 
{
	int rollNo;
	String name;
	int age;
	
	Student() //Default Constructor
	{
		
	}
	
	Student(int rollNo, String name, int age) //Parameterized Constructor
	{
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}
}

class AgeComparator implements Comparator <Student> 
{	
	public int compare(Student studentOne , Student studentTwo)
	{
		if(studentOne.rollNo == studentTwo.rollNo)
		{
			return 0;
		}
		else if(studentOne.rollNo > studentTwo.rollNo)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}

public class ComparatorInterface
{
	public static void main(String args[])
	{
		ArrayList <Student> arrayList = new ArrayList <Student> ();
		arrayList.add(new Student(102 , "Vishal" , 23));
		arrayList.add(new Student(101 , "Nitesh" , 25));
		arrayList.add(new Student(105 , "Yogesh" , 21));
		 
		Collections.sort(arrayList , new AgeComparator());
		
		for(Student student : arrayList)
		{
			System.out.println(student.rollNo + " " + student.name + " " + student.age);
		}
	}
}

