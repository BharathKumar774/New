package asssignmentcouchit;

public class Reverse_Upper 
{

	public static void main(String[] args)
	{
		 String str = "This Is Java";
	        String str1 =str.toLowerCase();
	        StringBuilder sb = new StringBuilder();
	        for (String s : str1.split(" "))
	        {
	            String revSt = new StringBuilder(s).reverse().toString();
	            revSt = revSt.substring(0,0) +Character.toUpperCase(revSt.charAt(0))+ revSt.substring(1); 

	            sb.append(revSt).append(" ");
	        }
	        System.out.println(sb);

	}

}
