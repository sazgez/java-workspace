package ExampleAbstractClass;

public class Programci extends Calisan {
	public Programci() {
		pozisyon = "Programci";
	}
	public void calis() // override (essential !)
	{
		System.out.println("Programci calisiyor");
	}
	public void zamIste() // override (not essential)
	{
		System.out.println("Progrmaci zamIste");
	}
}
