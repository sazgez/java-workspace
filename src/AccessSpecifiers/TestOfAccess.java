package AccessSpecifiers;
class TestOfAccess {
	int a; // default access
	public int b; // public access
	private int c; // private access
	
	void setc(int i) {
		c = i;
	}
	
	int getc() {
		return c;
	}
}
