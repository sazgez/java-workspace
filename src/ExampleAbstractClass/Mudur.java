package ExampleAbstractClass;

public class Mudur extends Calisan {
	public Mudur() {
		pozisyon = "Mudur";
	}
	public void calis() // override (essential !)
	{
		System.out.println("Mudur calisiyor");
	}
}
