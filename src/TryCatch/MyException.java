package TryCatch;
public class MyException extends Exception {
	private int sayac;
	MyException(int a){
		sayac = a;
	}
	
	public String toString() {
		return "MyException["+sayac+"]";
	}
}
