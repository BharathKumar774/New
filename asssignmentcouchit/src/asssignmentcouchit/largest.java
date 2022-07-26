package asssignmentcouchit;

public class largest 
{
	public static void main(String[] args)
	{
		int a[]= {10,2030,40,50};
		int l =a[0],s = a[0];
		for(int i =1;i<a.length;i++) {
		if(a[i]<100) {
		l=a[i];
		}
		}
		for(int i =1;i<a.length;i++) {
		if(a[i]<0) {
		s=a[i];
		}
		}
		System.out.println(l);
		System.out.println(s);
	}

}
