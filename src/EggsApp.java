/*
John the farmer has tasked his son with collecting the eggs from the chicken coop each morning
and putting them in boxes of 1 dozen eggs each. Unfortunately Johns son Joe is having trouble
working out how many boxes he will need each morning.
You have been asked to develop a java application to allow Joe to enter the number of eggs he has collected.
The application should then calculate and output how many boxes can be filled and how many eggs Joe will have leftover.

Save the class as EggsApp.java

*Hint: there are 12 eggs in 1 dozen
*/
import java.util.Scanner;
public class EggsApp {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int egg;
		
		System.out.print("Enter number of collected eggs: ");
		
		if(reader.hasNextInt()) {
			egg = reader.nextInt();
			int box, leftover, dozen = 12;
			
			box = egg / dozen;
			leftover = egg % dozen;
			
			System.out.println(box+" box/boxes can be filled.\n"+leftover+" egg/eggs will be leftover.");
		}else {
			System.out.println("Entered wrong.");
		}
	}
}