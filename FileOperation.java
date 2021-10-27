/*Program to perform operation on file*/

import java.io.File;
import java.io.FileReader;

public class FileOperation
{
	public static void main(String args[])throws Exception
	{
		FileReader fileReader = new FileReader("D:\\Qdev.txt");    
        int i;    
		  
        while((i = fileReader.read()) != -1)  
		{			  
			System.out.print((char)i);
		}
		fileReader.close();    
	 }
}