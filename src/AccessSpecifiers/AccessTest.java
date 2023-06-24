package AccessSpecifiers;
class AccessTest {
	public static void main(String[] args) {
		TestOfAccess obj = new TestOfAccess();
		
		obj.a = 10;
		obj.b = 20;
	  //obj.c = 30;  Error!
		
		obj.setc(30);
		
		System.out.println("a, b, and c: "+obj.a+", "+obj.b+", "+obj.getc()+".");
	}
}