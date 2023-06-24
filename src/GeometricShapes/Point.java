package GeometricShapes;
public class Point {
	
	public int x = 0;
	public int y = 0;
	
	/*public Point(int a, int b) { // Constructor
		x = a;
		y = b;
	}*/
	public Point(int x, int y) { // Constructor with "this"
		this.x = x;
		this.y = y;
	}
	public static void main(String[] args) {
		Point originOne = new Point(23,94);
	}
}