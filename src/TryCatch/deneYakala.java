package TryCatch;
import java.util.Random;

public class deneYakala {

	public static void main(String[] args) {
		int q, p;
		
		try {
			q = 0;
			p = 38 / q;
			System.out.println("Bu satir yazilmaz.");
		}catch(ArithmeticException e) {
			System.out.println("Sifira bölünme hatasi.");
		}
		System.out.println("catch blokundan sonraki kodlar...");
		
		int x = 0, y = 0, z = 0;
		
		Random r = new Random();
		
		/*for (int i = 0; i < 1200; i++) {
			try {
				y = r.nextInt();
				z = r.nextInt();
				x = 56789 / (y/z);
			}catch(ArithmeticException e) {
				System.out.println("Sifira bölünme hatasi.");
				x = 0; // devam etmek icin 0'a atandi
			}
			System.out.println("x: "+x);
		}*/
		
		try {
			int a = r.nextInt(2);
			
			System.out.println("a = "+a);
			
			int b = 38 / a;
			int c[] = {1};
			c[38] = 99;
		}catch(ArithmeticException e) {
			System.out.println("O ile bölünme: "+e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index oob: "+e);
		}
		System.out.println("try/catch blokundan sonraki kodlar.");
		
		try {
			int w = 0;
			int v = 38 / w;
		}catch(Exception e) {
			System.out.println("Generic Exception catch."); // asagidaki kodlara ulasilmaz cünkü,
		}/*catch(ArithmeticException e) {						ArithmeticException sinifi
			System.out.println("Bu koda ulasilmaz.");			Exception sinifinin alt-sinifidir
		}*/
		
		try {
			demoyap();
		}catch(NullPointerException e) {
			System.out.println("tekrar yakalaniyor: "+e);
		}
		
		try {
			throwBir();
		}catch(IllegalAccessException e) {
			System.out.println("Yakalaniyor ... "+e);
		}
		
		int number = 2; // 1, 2, 4 haricinde sonsuz döngüye girer !!!
		
		while(true) {
			System.out.print("Who ");
			
			try {
				System.out.print("is ");
				
				if(number == 1) {
					return; // main method'undan cikar ama finally'ye ugrar!
				}
				
				System.out.print("that ");
				
				if(number == 2) {
					break; // while'dan cikar ama finally'ye ugrar!
				}
				
				System.out.print("strange ");
				
				if(number == 3) {
					continue; // önce finally'ye ugrar ve döngüyü bastan alir (infinity)
				}
				
				System.out.print("but kindly ");
				
				if(number == 4) {
					throw new NullPointerException(); // finally'ye ugrar ve exception atar
				}
				
				System.out.print("not at all ");
			}finally {
				System.out.print("amusing man?\n");
			}
			System.out.print("I'd like to meet the man ");
		}
		System.out.print("Please tell me.\n");
	}
	
	static void demoyap() {
		try {
			throw new NullPointerException("demo");
		}catch(NullPointerException e) {
			System.out.println("hata, demoyap icinde yakalandi.");
			throw e;
		}
	}
	
	static void throwBir() throws IllegalAccessException{
		System.out.println("throwBir icinde.");
		throw new IllegalAccessException("demo");
	}
}