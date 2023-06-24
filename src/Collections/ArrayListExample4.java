package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample4 {
	public static void main(String[] args) {
		List a = new ArrayList();
		a.add("Bir");
		a.add("İki");
		a.add("Üç");
		a.add("Dört");
		a.add("Beş");
		a.add("Altı");
		
		System.out.println(" a ArrayListi = " + a);
		System.out.println(a.isEmpty()); // false
		System.out.println(a.contains("Altı")); //true
		a.remove(3); // "Dört" cikarildi
		System.out.println(" a ArrayList = " + a);
		System.out.println(" a ArrayList = " + a.remove(1)); // Iki
		System.out.println(" a ArrayList = " + a); // "Iki" yok artik
		a.clear();
		System.out.println(" a ArrayList = " + a);
		}
}