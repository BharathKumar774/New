package asssignmentcouchit;

public class Reversen_num 
{

	public static void main(String[] args)
	{
		String a="coach it";
		String b="123";
		for (int i=a.length()-1;i>=0;i--)
		{
		    System.out.print(a.charAt(i));
		}
		System.out.println();
		    for (int j=b.length()-1;j>=0;j--)
		    {
		    System.out.print(b.charAt(j));
		    }
		/*String a="coach it";
		String rev="";
		char ch;
		for (int i=0;i<a.length();i++)
		{
			ch=a.charAt(i);
			rev=ch+rev;
		}
		System.out.print(rev);*/
	}

}
