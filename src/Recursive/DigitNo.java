package Recursive;
import java.util.Scanner;

public class DigitNo {
	public static void main(String[] args) {
	int n, d;
	System.out.print("Please enter number: ");
	Scanner reader = new Scanner(System.in);
	n = reader.nextInt();
	
	System.out.print("Digit number (by recursive): ");
	System.out.println(recursive(n));
	
	d = 1;
	while(n>9) {
		n = n/10;
		d = d+1;
	}
	
	System.out.print("Digit number (by while): ");
	System.out.println(d);
	
	}
	
	public static int recursive(int number)
	{
		if((number < 10) && (number > -10))
			return 1;
		else
			return 1 + recursive(number / 10);
	}
}