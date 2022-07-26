package asssignmentcouchit;

public class Fibo_num 
{
	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		int c;
		int i;
		int count=5;
		System.out.println(a+"\n"+b);
		for(i=2;i<count;i++)
		{
			c=a+b;
			System.out.println(" "+c);
			a=b;
			b=c;
		}
	}

}
