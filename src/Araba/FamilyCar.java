package Araba;
public class FamilyCar {
	private Motor m = new Motor(); // Composition
	
	public void moveOn() {
		m.work();
		System.out.println("Family car just worked.");
	}
	public void stop() {
		m.stop();
		System.out.println("Family car just stopped.");
	}
	
	public static void main(String args[]) {
		FamilyCar aa = new FamilyCar();
		aa.moveOn();
		aa.stop();
	}
}
