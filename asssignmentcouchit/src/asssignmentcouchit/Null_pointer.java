package asssignmentcouchit;

public class Null_pointer 
{

	public static void main(String[] args) 
	{
		String a=null;
		try
		{
			System.out.println(a.length());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
