public class StringMethods {
	
	public static void main(String[] args) {
		String greeting = "Hello World!";
		
		char[] halloArray = {'h', 'a', 'l', 'l', 'o'};
		
		System.out.println(halloArray[0]); // h
		
		String halloString = new String(halloArray);
		
		System.out.println(greeting.charAt(0)); // H
		
		System.out.println(halloString.charAt(4)); // o
		
		System.out.println(halloString.length()); // 5
		
		System.out.println(greeting.length()); // 12
		
		System.out.println(halloString.charAt(halloString.length()-1)); // o
		
		System.out.println(greeting.charAt(greeting.length()-1)); // !
		
		String palindrome = "marabobaram";
		int len = palindrome.length();
		System.out.println(len); // 11
		
		String you = "Yu ";
		String x = "Ay ".concat("Lav ").concat(you);
		System.out.println(x+"Tuu!"); // Ay Lav Yu Tuu!
		
		int i = 99;
		String s1 = ""+i; // or s1 = i+""; (doesn't matter)
		System.out.println(s1); // 99
		String s2 = Integer.toString(i);
		System.out.println(s2); // 99
		
		double pi = 3.1415;
		System.out.println(Double.toString(pi)); //3.1415
		
		String s3 = "202.2";
		double d = (Double.valueOf(s3)).doubleValue();
		System.out.println(d); //202.2
		
		String wort = "Gott sei Dank!";
		String wortEins = wort.substring(wort.length()-5); // wort.substring(9); ---> o indexten baslar yazmaya
		System.out.println(wortEins); // Dank!
		String wortZwei = wort.substring(0, 4); // 1. indexten baslayarak 2. indexe kadar (son dahil degil) harfleri cikarir
		System.out.println(wortZwei); // Gott
		
		String hallo = "hallo";
		String hello = hallo.replace('a', 'e'); // bütün 'a' lari 'e' ye dönüstürür
		System.out.println(hello); // hello
	}
}