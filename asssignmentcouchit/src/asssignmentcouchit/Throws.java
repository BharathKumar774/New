package asssignmentcouchit;

public class Throws 
{
	static void check() throws Exception
	{
		System.out.println("function");
		throw new Exception("demo");
	}
	public static void main(String[] args)
	{
		try
		{
			check();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
