package ExampleAbstractClass;

public class Futbolcu extends Sporcu{
	int antreman_sayisi = 4;
	
	public Futbolcu(){
		System.out.println("Futbolcu constructor");
		calis();
	}
	public void calis()
	{
		System.out.println("Futbolcu calis() "+antreman_sayisi);
	}
}
