package Voltran;
public class Voltran {
	// Composition
	Govde gv = new Govde();
	SolBacak slb = new SolBacak();
	SagBacak sgb = new SagBacak();
	SolKol slk = new SolKol();
	SagKol sgk = new SagKol();
	Kafa k = new Kafa();
	
	public static void main(String[] args) {
		Voltran v = new Voltran();
		v.k.dusmanTaniSistemiAktifEt();
		v.k.tumBirimlereUyariGonder();
		v.gv.benzinTankKontrolEt();
		v.sgk.kalkaniCalistir();
		v.slk.gucKaynagiKonrolEt();
		v.sgb.kirmiziLazerSilahiAtesle();
		v.slb.maviLazerSilahiAtesle();
	}
}
