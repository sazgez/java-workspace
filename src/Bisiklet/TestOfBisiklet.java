package Bisiklet;
public class TestOfBisiklet {

	public static void main(String[] args) {
		System.out.println("Mevcut bisiklet sayisi: "+Bisiklet.getBisikletSayisi());
		Bisiklet benimBisiklet = new Bisiklet("beyaz",18,8);
		System.out.println("Yeni bir bisiklet nesnesi olusturuldu. Bisiklet ID = "+benimBisiklet.getID());
		System.out.println("Mevcut bisiklet sayisi: "+Bisiklet.getBisikletSayisi());
	}
}
