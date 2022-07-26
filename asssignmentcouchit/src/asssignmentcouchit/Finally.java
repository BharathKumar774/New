package asssignmentcouchit;

public class Finally 
{
	public static void main(String[] args)
	{
		int []arr=new int[4];
		try
		{
			int i=arr[4];
			System.out.println("inside try block");
		}
		catch (Exception e)
		{
			System.out.println("Exception caught in catch block");
		}
		finally
		{
			System.out.println("finally block executed");
		}
		System.out.print("outside try catch finally block");
	}

}
