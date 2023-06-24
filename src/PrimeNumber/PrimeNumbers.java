package PrimeNumber;
// This program calculates the prime numbers until entered number.

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		int x;
		int i, j, isPrime = 1;
		
		System.out.print("Enter a number: ");
		
		Scanner reader = new Scanner(System.in);
		x = reader.nextInt();
		
		for(j = 2; j <= x; j++) {
			for(i = 2; i <= j/2; i++) {
				if(j % i == 0) {
					isPrime = 0;
					break;
				}
			}
			if(isPrime == 1) {
				System.out.print(j + " ");
			}
			isPrime = 1;
		}
	}
}
