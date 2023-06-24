package Collections;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		String[] kisiler = {"B", "C", "D", "F", "H", "K", "L"};
		List<String> liste = new ArrayList<String>();
		
		for(String kisi : kisiler) // caution!
		{
			liste.add(kisi);
		}
		System.out.print("liste elemanlari sirali: ");
		System.out.println(liste);
		System.out.print("rastgele karistirilmis liste: ");
		Collections.shuffle(liste, new Random());
		System.out.println(liste);
	}

}
