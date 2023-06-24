import java.util.Scanner;

public class WhatsItDoing {
	public static void main(String[] args) {
		int n;
		int m;
		
		Scanner reader = new Scanner(System.in);
		n = reader.nextInt();
		m = reader.nextInt();
		while(n != m) {
			if(m > n) {
				m = m - n;
			}else {
				n = n - m;
			}
		}
		System.out.println(m);
	}
}
