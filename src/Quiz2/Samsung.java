package Quiz2;

class Samsung extends SmartPhone {
	public int hiz;
	public int kamera;

	public Samsung(){
	    super("Samsung", "Galaxy", 64);
	    hiz = 60;
	    kamera = 48;
	    
	}
	  
	public Samsung(String Model, int Hafiza, int Hiz, int Kamera) {
		super("Samsung", Model, Hafiza);
	    hiz = Hiz;
	    kamera = Kamera;
	}
	
	public void BilgileriYazdir() {
		System.out.println("ID: " + getID());
	    System.out.println("Marka: " + marka);
	    System.out.println("Model: " + model);
	    System.out.println("Hafıza: " + hafiza +" GB");
	    System.out.println("Hız: " + hiz + " ms");
	    System.out.println("Kamera: " + kamera + " MP");
	}
	
	public void HizDegerlendir() {
		System.out.println("Hiziniz " + hiz + " ms.");
	}

	public void KameraDegerlendir() {
		System.out.println("Kameraniz " + kamera + " megapixel kullaniyor.");
	}
}