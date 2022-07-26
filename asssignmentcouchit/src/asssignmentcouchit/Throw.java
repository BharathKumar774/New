package asssignmentcouchit;

public class Throw 
{

	public static void main(String[] args)
	{
		int a=15;
		try
		{
			if(a<15)
				throw new Exception ();
			else
				System.out.println("value is valid");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
