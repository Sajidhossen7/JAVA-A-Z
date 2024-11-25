import java.lang.*;
import java.io.*;

public class ReadFile
{
	public static void main(String[] args)
	{
		try
		{
			FileReader fdr=new FileReader("data/javacData.txt");
			BufferedReader bfr=new BufferedReader(fdr);
			String temp="";
			while((temp=bfr.readLine())!=null)
			{
				System.out.println(temp);
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}