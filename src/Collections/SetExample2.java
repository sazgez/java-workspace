package Collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample2 {

	public static void main(String[] args) {
		String[] kisiler = {"ali", "ahmet", "ali", "mehmet"};
		Set<String> kume = new HashSet<String>();
		
		for(String kisi : kisiler) // caution!
		{
			if(!kume.add(kisi))
			{
				System.out.println(kisi+" zaten kayitli !");
			}
		}
		System.out.println(kume.size()+" kisi kaydedildi.");
	}

}
