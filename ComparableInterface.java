/*Program using Comparable Interface*/

import java.util.Collections;
import java.util.ArrayList;
import java.lang.Comparable;

class Student implements Comparable<Student>
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
	
	public int compareTo(Student student)
	{
		if(rollNo == student.rollNo)
		{
			return 0;
		}
		else if(rollNo > student.rollNo)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}

public class ComparableInterface
{
	public static void main(String args[])
	{
		ArrayList <Student> arrayList = new ArrayList <Student> ();
		arrayList.add(new Student(102 , "Vishal" , 23));
		arrayList.add(new Student(101 , "Nitesh" , 25));
		arrayList.add(new Student(105 , "Yogesh" , 21));
		 
		Collections.sort(arrayList);
		
		for(Student student : arrayList)
		{
			System.out.println(student.rollNo + " " + student.name + " " + student.age);
		}
	}
}

