package asssignmentcouchit;
import java.util.Scanner;

public class Armstrong 
{
	public static void main(String[] args) 
	{
		int num=0;
		int number=0;
		int temp =0;
		int total=0;
		System.out.println ("Enter the number:");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		s.close();
		number=num;
		while(number!=0)
		{
			temp=number%10;
			total=total+temp*temp*temp;
			number=number/10;
		}
		if(total==num)
			System.out.println(num+"is a Armstrong number");
		else
			System.out.println(num +"is not a Armstrong number");
	}

}
