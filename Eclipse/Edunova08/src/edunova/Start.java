package edunova;

public class Start {
	
	// U Start klasi napraviti dvije 
		// instance klase Racunalo
	
	private static Racunalo kreirajRacunalo (String model, boolean ispravno, int RAM, float brzinaProcesora, double cijena) {
		
		Racunalo racunalo = new Racunalo();
		racunalo.setModel(model);
		racunalo.setIspravno(ispravno);
		racunalo.setRAM(RAM);
		racunalo.setBrzinaProcesora(brzinaProcesora);
		racunalo.setCijena(cijena);
		return racunalo;
	}

}
