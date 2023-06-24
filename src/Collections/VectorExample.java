package Collections;

import java.util.Vector;

public class VectorExample {
	
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("Zonguldak");
		v.add("Sinop");
		v.add("Trabzon");
		v.add("Rize");
		v.add("İzmit");
		
		v.add(3, "Bafra"); // indisi 3 olan konuma bir öğe sokustur (insetion)
		
		System.out.println("Vektörün uzunluğu :" + v.size()); // v.size() vektörün bilesen sayısını verir
		
		for (int i = 0; i < v.size(); i++) {
		System.out.println("Vektör öğesi : " + i + " :" + v.get(i)); // v.get(i) vektörün i-inci indisli terimini verir
		}
	}
}
