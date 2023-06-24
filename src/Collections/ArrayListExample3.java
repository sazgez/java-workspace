package Collections;

import java.util.*;

public class ArrayListExample3 {

	public static void main(String[] args) {
		List a = new ArrayList();
		a.add("Bir");
		a.add("İki");
		a.add("Üç");
		a.add("Dört");
		a.add("Beş");
		a.add("Altı");
		
		System.out.println("ArrayList = " + a);
		List b = new ArrayList();
		b.addAll(a);
		System.out.println("Yeni dizi = " + b);
	}
}