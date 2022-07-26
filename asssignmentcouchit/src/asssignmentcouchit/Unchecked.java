package asssignmentcouchit;

public class Unchecked 
{
	public static void main(String[] args) 
	{
		int a=15,b=0;
		try {
		System.out.println("exception creation"+a/b);
		}
		catch( Exception e){
		System.out.print(e);
		}
	}

}
