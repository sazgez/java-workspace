package Collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		String[] kisiler = {"ali", "ahmet", "ali", "mehmet"};
		Set kume = new HashSet();
		
		for(int i = 0; i < kisiler.length; i++)
		{
			if(!kume.add(kisiler[i]))
			{
				System.out.println(kisiler[i]+" zaten kayitli !");
			}
		}
		System.out.println(kume.size()+" kisi kaydedildi.");
	}

}
