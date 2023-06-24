package Bisiklet;
public class Bisiklet {
	
	private String renk;
	private int vites, hiz, id;
	private static int bisikletSayisi = 0; // class variable
	static final double PI = 3.141592653589793; // value of the variable couldn't change
	
	public Bisiklet(String renk, int vites, int hiz) { // constructor
		this.renk = renk;
		this.vites = vites;
		this.hiz = hiz;
		id = ++bisikletSayisi;
	}
	public Bisiklet() {
		id = ++bisikletSayisi;
	}
	public static int getBisikletSayisi() {
		return bisikletSayisi;
	}
	public int getID() {
		return id;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public int getVites() {
		return vites;
	}
	public void setVites(int vites) {
		this.vites = vites;
	}
	public int getHiz() {
		return hiz;
	}
	public void hizlan(int artis) {
		hiz += artis;
	}
	public void yavasla(int dusus) {
		hiz -= dusus;
	}
	public void Bysiklet(String x) { // Method Overloading
		// ...
	}
	public void Bysiklet(String x, int i) {
		// ...
	}
	public static void main(String[] args) {
		// ...
	}
}