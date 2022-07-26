package asssignmentcouchit;
public class Deadlock extends Thread
{
			static final String value1= "bus";
			static final String value2= "car";
			public void run() 
			{
			synchronized (value1)
			{
			System.out.println("Deadlock: locked" + value1);
			try 
			{
			Thread.sleep(10);
			} 
			catch (Exception e)
			{
			}
			}
			System.out.println("Deadlock: waiting for" + value2);
			synchronized (value2) 
			{
			System.out.println("Deadlock: locked" + value2);
			}
			}
			public static void main(String[] args) {
			Deadlock Thread = new Deadlock();
			Thread.start();
			}
}
			
	
