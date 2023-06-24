package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		String[] kelimeler = {"Ali", "Ali", "is", "is", "is", "Java", "kod", "C", "C"};
		Map<String, Integer> m = new HashMap<String, Integer>();
		
		for(String kelime : kelimeler)
		{
			Integer freq = m.get(kelime);
			m.put(kelime, (freq == null)? 1 : (freq + 1));
		}
		System.out.println(m.size()+" farkli kelime.");
		System.out.println(m);
	}

}
