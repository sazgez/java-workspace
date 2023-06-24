package PackageUsage;
import GeometricShapes.*;
import java.util.Scanner;

public class Viereck {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Gib infolgendes länge und breite ein:");
		
		int w = reader.nextInt();
		int h = reader.nextInt();
		
		Point p = new Point(30, 60);
		Rectangle v = new Rectangle(p, w, h);
		
		System.out.println("Der Bereich von das Viereck: " + v.getArea());
	}

}
