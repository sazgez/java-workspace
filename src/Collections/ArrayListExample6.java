package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample6 {
	public static void main(String[] args) {
		List a = new ArrayList();
		a.add("On");
		a.add("Yirmi");
		a.add("Otuz");
		a.add("Kırk");
		a.add("Elli");
		a.add("Altmış");
		
		System.out.println(" a ArrayListi = " + a);
		System.out.println(a.size());
		
		a.set(3, "Beşyüz"); // yerine
		
		System.out.println(" a ArrayListi = " + a);
		System.out.println(a.size());
		
		a.add(3, "Altıyüz"); // öncesine ekle
		
		System.out.println(" a ArrayListi = " + a);
		System.out.println(a.size());
		}
}
