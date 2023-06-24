package Collections;

import java.util.HashMap;
import java.util.Iterator;

public class Map_Iterator{
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("123", "Ahmet");
		hm.put("456", "Mehmet");
		Iterator<String> iter= hm.keySet().iterator();
		
		while (iter.hasNext())
		{
			String eleman = hm.get(iter.next());
			System.out.println(eleman);
		}
	}
}