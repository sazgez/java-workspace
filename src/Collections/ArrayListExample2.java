package Collections;

import java.util.*;

public class ArrayListExample2 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("İZMİR");
		list.add("ERZURUM");
		list.add("GİRESUN");
		list.add("KONYA");
		list.add("ANTALYA");
		
		System.out.println(list);
		System.out.println("3: " + list.get(3));
		System.out.println("0: " + list.get(0));
	}
}