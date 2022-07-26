package asssignmentcouchit;
import java.util.*;
import java.util.Arrays;
public class Sorting 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		 int [] a={1, 2, 3, -1, -2, 4};
		 for(int i=0;i<a.length;i++)
		 Arrays.sort(a);
		 for(int a1 :a)
		  {
		  System.out.print(a1);
	}
	}
}
