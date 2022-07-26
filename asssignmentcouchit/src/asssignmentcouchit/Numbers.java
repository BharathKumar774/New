package asssignmentcouchit;

public class Numbers 
{
	public static void main(String[] args)
	{
		int[]list1 = {10,20,30,40,50};
		int[] list2 = {10,30,40,50,20};
		int count=0;
		for(int i=0; i<list1.length; i++)
		{
		for(int j=0; j<list2.length; j++)
		{
		if(list1[i]==list2[j])
		{
		count++;
		}
		}
		}
		if(count==list1.length)
		{
		System.out.print("contains same numbers");
		}
		else
		{
		System.out.print("contains different numbers");
		}
	}

}
