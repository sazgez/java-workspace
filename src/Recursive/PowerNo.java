package Recursive;
import java.util.Scanner;
import java.lang.Math;

public class PowerNo {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int number = reader.nextInt();
		
		System.out.print("Enter power: ");
		int power = reader.nextInt();
		
		System.out.print(number+"'s "+power+"th power (by recursive): ");
		System.out.println(recursive(number, power));
		
		System.out.print(number+"'s "+power+"th power (by Math.pow() method): ");
		System.out.println((int) Math.pow(number, power));
	}
	
	public static int recursive(int number, int power)
	{
		if((power == 0) || (number == 1))
			return 1;
		else
			return number * recursive(number, power - 1);
	}
}
