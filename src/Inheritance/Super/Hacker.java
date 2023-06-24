package Inheritance.Super;
class Hacker extends ZekiInsan{
	public Hacker(int par) {
		super(par+1); // ilk satira yazilmali her zaman
		System.out.println("Hacker Constructor\t"+par);
	}

	public static void main(String[] args) {
		Hacker hacker = new Hacker(5);
	}
}
