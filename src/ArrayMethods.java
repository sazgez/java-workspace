import Bisiklet.Bisiklet;

public class ArrayMethods {
	public static void main(String[] args) {
		int[] anArray; // integer dizisi tanimlandi
		anArray = new int[3]; // 3 tane integer icin hafizada yer ayrildi
		
		anArray[0] = 100;
		anArray[1] = 200;
		anArray[2] = 300;
		
		//int[] anArray = {100, 200, 300}; // alternatif dizi olusturma yolu
		
		System.out.println("Element at index 0: " + anArray[0]);
		System.out.println("Element at index 1: " + anArray[1]);
		System.out.println("Element at index 2: " + anArray[2]);
		System.out.println("Length of the Array: " + anArray.length);
		
		String[][] names = new String[2][];
		
		names[0] = new String[3];
		names[0][0] = "Mr. ";
		names[0][1] = "Mrs. ";
		names[0][2] = "Ms. ";
		
		names[1] = new String[2];
		names[1][0] = "Smith";
		names[1][1] = "Jones";
		
		//String[][] names = { {"Mr. ", "Mrs. ", "Ms. "}, {"Smith", "Jones"} };
		
		System.out.println(names[0][0] + names[1][0]); // Mr. Smith
		System.out.println(names[0][1] + names[1][1]); // Mrs. Jones
		
		char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};
		
		char[] copyTo = new char[7];
		System.arraycopy(copyFrom, 2, copyTo, 0, 7);
		System.out.println(new String(copyTo)); // caffein
		
		char[] CopyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
		System.out.println(new String(CopyTo)); // caffein
		
		Bisiklet[] mybike = new Bisiklet[2];
		mybike[0] = new Bisiklet("kirmizi", 5, 5);
		mybike[1] = new Bisiklet();
		mybike[1].setRenk("sari");
		mybike[1].setVites(18);
		mybike[1].hizlan(4);
		
		System.out.println("Bisiklet sayisi: " + Bisiklet.getBisikletSayisi()); // 2
		System.out.println("Array uzunluk: "+ mybike.length); // 2
		System.out.println("Bisiklet ID: " + mybike[0].getID() + "\n" + "Renk: " + mybike[0].getRenk()); // 1 & kirmizi
		
		int[] tempDizi = {10, 20, 30, 200, -5};
		int sonuc = topla(tempDizi);
		System.out.println("Sum of elements: " + sonuc); // 255
		
		artir(tempDizi);
		System.out.println(tempDizi[0] + ", " + tempDizi[4]); // 11, -4
	}
	public static int topla(int[] dizi) {
		int sonuc = 0;
		for (int i = 0; i < dizi.length; i++) {
			sonuc += dizi[i];
		}
		return sonuc;
	}
	public static void artir(int[] dizi) {
		for (int i = 0; i < dizi.length; i++) {
			dizi[i]++;
		}
	}
}