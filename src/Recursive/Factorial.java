package Recursive;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int number = reader.nextInt();
		
		System.out.print(number+"! (by recursive): ");
		System.out.println(recursive(number));
		
		int result = 1;
		if(number > 1)
		{
			for(int i = number; i >= 2; i--)
			{
				result *= i;
			}
		}
		System.out.print(number+"! (by for): ");
		System.out.println(result);
		
	}
	
	public static int recursive(int number)
	{
		if((number == 0) || (number == 1))
			return 1;
		else
			return number * recursive(number - 1);
	}
}
