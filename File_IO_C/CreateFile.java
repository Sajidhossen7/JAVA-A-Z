import java.lang.*;
import java.io.*;

public class CreateFile
{
	public static void main(String[] args)
	{
		try
		{
			File f=new File("data/myData.pdf");
		
			if(f.createNewFile())
			{
				System.out.println("File Created Successfully");
			}
			
			else
			{
				System.out.println("File already Exists");
			}
			
			if(f.canRead())
			{
				System.out.println("The file is readable");
			}
			
			else
			{
				System.out.println("The file is not readable");
			}
			
			if(f.canWrite())
			{
				System.out.println("The file is Writeable");
			}
			
			else
			{
				System.out.println("The file is not Writeable");
			}
			
			File fw=new File("data");
			
			String[] s=fw.list();
			
			//System.out.println(fw.list());
			for(int i=0; i<s.length; i++)
			{
				System.out.println(s[i]);
			}
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}