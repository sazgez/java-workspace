package Inheritance;
public class Kaplan extends Kedi {

	public static void main(String[] args) {
		Kedi kd = new Kedi();
		kd.yakalaAv();
		
		Kaplan kp = new Kaplan();
		kp.yakalaAv();
		System.out.println("Ayak sayisi = "+kp.ayakSayisi);
	}

}
