package Inheritance.Super;
class ZekiInsan extends Insan{
	public ZekiInsan(int par) {
		super(par+1); // ilk satira yazilmali her zaman
		System.out.println("ZekiInsan Constructor\t"+par);
	}
}
