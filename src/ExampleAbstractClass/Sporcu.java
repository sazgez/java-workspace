package ExampleAbstractClass;

public abstract class Sporcu {
	public abstract void calis();
	public Sporcu() {
		System.out.println("calis() cagrilmadan önce");
		calis();
		System.out.println("calis() cagrildiktan sonra");
	}
}
