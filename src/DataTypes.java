import GeometricShapes.Point;

public class DataTypes {

	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		
		System.out.println(x); // 3
		System.out.println(y); // 4
		
		y = x;
		x = 100;
		
		System.out.println(x); // 100
		System.out.println(y); // 3
		
		Point first = new Point(4,7);
		Point second = new Point(15,20);
		
		System.out.println(first.x); // 4
		System.out.println(second.x); // 15
		
		second = first;
		second.x = 100;
		
		System.out.println(first.x); // 100
		System.out.println(second.x); // 100
		
		first.x = 2;
		
		System.out.println(first.x); // 2
		System.out.println(second.x); // 2
	}
}