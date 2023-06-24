package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample5 {
	public static void main(String[] args) {
		List a = new ArrayList();
		a.add("Çiğdem");
		a.add("Papatya");
		a.add("Kardelen");
		a.add("Lale");
		a.add("Sümbül");
		a.add("Gül");
		
		System.out.println(" a ArrayListi = " + a);
		
		a.add(3, "Diken"); // "Lale" yerine degil!
		
		System.out.println(" a ArrayListi = " + a);
		System.out.println(a.indexOf("Diken"));
		
		a.set(3, "Gelincik"); // "Diken" yerine!
		
		System.out.println(" a ArrayListi = " + a);
		System.out.println(a.lastIndexOf("Kamelya")); // Kamelya olmadiginda default value -> "-1"
		}
}
