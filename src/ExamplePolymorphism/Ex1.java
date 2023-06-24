package ExamplePolymorphism;

public class Ex1 {
	public static void hazirlanSinavVar(Kisi k) { // burada k'nin farkli nesnelere
		k.dersCalis(); // polymorphism !		  // baglanmasi polymorphism'dir.
	}
	public static void main(String[] args) {
		Kisi kisi = new Kisi();
		Ogrenci ogr = new Ogrenci();
		Akademisyen aka = new Akademisyen();
		
		hazirlanSinavVar(kisi);
		hazirlanSinavVar(ogr); // upcasting
		hazirlanSinavVar(aka); // upcasting
	}

}
/*
 * Türetilen alt sınıfa ait nesneyi ana sınıf tipindeki referansa bağlamak
 * yukarı doğru çevirim (upcasting) işlemidir.
 * 
 * Eğer bir metodun hangi nesneye ait olduğu çalışma anında belli oluyorsa
 * bu olaya geç bağlama (late-binding) denir.
 * 
 * Bu olayın tam tersi ise erken bağlamadır (early binding): Yani, hangi
 * nesnenin hangi metodunun çağrılacağı derleme anında bilinmesi. 
*/
