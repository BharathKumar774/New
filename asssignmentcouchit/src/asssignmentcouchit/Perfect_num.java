package asssignmentcouchit;
import java.util.Scanner;
public class Perfect_num 
{
	public static void main(String[] args) 
	{
		int a,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the value:");
		a=s.nextInt();
		int i=1;
		while(i<=a/2)
		{
			if(a%i==0) 
			{
				sum=sum+i;
			}
			i++;
		}
		if(sum==a)
		{
			System.out.println(a+"perfect");
		}
		else
			System.out.println(a+"not perfect");
	}

}
