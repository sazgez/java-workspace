package PrimeNumber;
/*
 This program outputs the corresponding answer 
 of the following question:
 " Is this a prime number? "
*/
import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {
		int x;
		int i, isPrime = 1;
		
		System.out.print("Enter your number for check: ");
		
		Scanner reader = new Scanner(System.in);
		x = reader.nextInt();
		
		for(i = 2; i <= x/2; i++) {
			if(x % i == 0) {
				isPrime = 0;
			}
		}
		if(isPrime == 1) {
			System.out.println(x + " is a Prime Number.");
		}else {
			System.out.println(x + " is not a Prime Number.");
		}
		isPrime = 1;
	}
}
