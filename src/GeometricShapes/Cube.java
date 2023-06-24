package GeometricShapes;
// This program computes the Volume & Area of a cube

import java.util.Scanner;

public class Cube{
	
	public static void main(String[] args) {
		double x;
		double V, A;
		
		System.out.print("Enter parameter of cube: ");
		
		Scanner reader = new Scanner(System.in);
		x = reader.nextDouble();
		
		V = x * x * x;
		A = 6 * x * x;
		
		System.out.print("The Volume: ");
		System.out.println(V);
		System.out.print("The Area: ");
		System.out.println(A);
		/*
		System.out.println("Volume: " + x*x*x);
		System.out.print("Area: " + 6*x*x);
		*/
	}
}