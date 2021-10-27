/*Create a file and add details in it.....*/

import java.lang.String;
import java.io.File; 
import java.io.FileWriter;
import java.io.IOException;
 
public class CreateFile
{
	public static void main(String args[])
	{
		File file = new File("D:\\Qdev.txt");
		boolean result;
		
		try
		{
			String data = "Vishal Prajapati";
			result = file.createNewFile();
			
			if(result)
			{
				System.out.println("File created");
			}
			else
			{
				System.out.println("File not created");
			}
			
			FileWriter fileWriter = new FileWriter("D:/Qdev.txt");
			
			for(int i = 0 ; i < data.length() ; i++)
			{
				fileWriter.write(data.charAt(i));
			}
			System.out.println("data successfully added");
			fileWriter.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
