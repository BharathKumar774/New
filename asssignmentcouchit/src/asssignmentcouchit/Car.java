package asssignmentcouchit;

import java.util.Scanner;

public class Car 
{
    static Scanner sc =new Scanner(System.in);
    public void speed()
    {
        System.out.println(" The speed is 0");
    }
    public void speed(String RollsRoyse,int x)
    {
        System.out.println("The speed is "+x+"kmph and car is"+RollsRoyse);
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.speed(sc.next(),sc.nextInt());
    }

}