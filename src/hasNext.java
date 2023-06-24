import java.util.Scanner;

public class hasNext {
	public static void main(String[] args) {
		int x, i;
		
		System.out.print("Enter the number: ");
		
		Scanner reader = new Scanner(System.in);
		
		if(reader.hasNextInt()) {
			x = reader.nextInt();
			System.out.println();
			System.out.println("The Multiplication Table of " + x);
			System.out.println();
			for(i = 0; i <= x; i++) {
				System.out.println(i + " * " + x + " = " + i*x);
			}
		}else {
			System.out.println("You didn't enter an integer\nTry again...");
		}
	}
}