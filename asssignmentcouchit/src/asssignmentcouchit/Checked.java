package asssignmentcouchit;

import java.io.FileWriter;
import java.io.IOException;

public class Checked 
{
	public static void main(String[] args) throws IOException 
	{
		FileWriter fw = new FileWriter("abc.txt");
		try

		{
		System.out.print(10/0);
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
		finally
		{
		System.out.println("finally");
		}
	}

}
