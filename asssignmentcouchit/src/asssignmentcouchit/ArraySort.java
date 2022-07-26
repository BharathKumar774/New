package asssignmentcouchit;
import java.util.Arrays;
import java.util.List;
public class ArraySort 
{
 public static void main(String[] args)
 {
 int swap;
 int i;
 int max = 0;
 int a[] = new int[]{1,2,3,-1,-2,4};
 for( i = 0;i<=a.length-1;i++)
 { 
 for(int j = i+1;j<4;j++)
 {
 if(a[i]>a[j])
 {
 swap = a[i];
 a[i]=a[j];
 a[j] = swap;
 }
 if(a[i]>max) 
{
 max = a[i]; 
 }
}
 System.out.println(a[i]);
 
 }
 List al = Arrays.asList(a);
System.out.println("max:"+max);
System.out.println(al.contains(a));
}
}

