package Araba;

class Araba {
	ArabaMotoru motor = new ArabaMotoru();
	Kapi sag_kapi = new Kapi();
	Kapi sol_kapi = new Kapi();
	Tekerlek[] tekerlekler = new Tekerlek[4];
	public Araba() {
		for (int i = 0; i < tekerlekler.length; i++) {
			tekerlekler[i] = new Tekerlek(); 
		}
	}
	public static void main(String[] args) {
		Araba sporAraba = new Araba();
		sporAraba.motor.calis();
		
		sporAraba.sag_kapi.ac();
		sporAraba.sag_kapi.kapa();
		sporAraba.sag_kapi.pencere.asagiyaCek();
		sporAraba.sag_kapi.pencere.yukariyaCek();
		
		sporAraba.sol_kapi.ac();
		sporAraba.sol_kapi.kapa();
		sporAraba.sol_kapi.pencere.asagiyaCek();
		sporAraba.sol_kapi.pencere.yukariyaCek();
		
		sporAraba.tekerlekler[0].havaPompala();
		sporAraba.tekerlekler[1].havaPompala();
		sporAraba.tekerlekler[2].havaPompala();
		sporAraba.tekerlekler[3].havaPompala();
		
		sporAraba.motor.dur();
	}
}
