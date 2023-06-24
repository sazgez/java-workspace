package PrimeNumber;
import java.util.Scanner;

public class isPrimeBoolean {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		
		int x = reader.nextInt();
		
		if(isPrime(x) == true) {
			System.out.println(x+" is prime.");
		}else {
			System.out.println(x+" isn't prime.");
		}
	}
	
	public static boolean isPrime(int n) {
		if(n<2) {
			return false;
		}
		
		for(int i = 2; i < n; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}