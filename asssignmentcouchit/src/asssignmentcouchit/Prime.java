package asssignmentcouchit;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		int temp=number;
		int count=0;
		for(int i=2;i<number;i++)
		{
		count=0;
		if(number%i==0)
		{
		number--;
		count++;
		}
		}
		if(count==0)
		{
		System.out.println(number);
		}
		number=temp;
		for(int i=2;i<number;i++)
		{
		count=0;
		if(number%i==0)
		{

		number++;
		}
		}
		if(count==0)
		{
		System.out.println(number);
	}
	}
}
