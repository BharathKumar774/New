package asssignmentcouchit;
import java.util.Scanner;

public class List 
{

	public static void main(String[] args) 
	{
int range, i;
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the range:");
        range = s.nextInt();
        
        System.out.println("Even numbers:");
        
        for(i=1; i<=range; i++){
            
            if(i % 2 == 0)
                System.out.println(i);
        }

	}

}
