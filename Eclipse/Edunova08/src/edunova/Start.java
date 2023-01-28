package edunova;

import java.util.Date;

public class Start {

	// U Start klasi napraviti dvije
	// instance klase Racunalo

	public static void main(String[] args) {

		Racunalo[] racunalo = new Racunalo[2];

		racunalo[0] = kreirajRacunalo("HP", true, 512, 4.2f, 525.99);
		racunalo[1] = kreirajRacunalo("Dell", true, 256, 3.9f, 4.1);
		
		// U klasi Start u niz unijeti 3 računa
		
	Racun[] racun = new Racun[3];
	
	racun[0]=kreirajRacun(new Date(), 12.5f, kreirajKupca("Toni", "Orahovica"));
	racun[1]=kreirajRacun(new Date(), 20.5f, kreirajKupca("Marko", "Našice"));
	racun[2]=kreirajRacun(new Date(), 10.5f, kreirajKupca("Ivan", "Osijek"));
	
	System.out.println(racun[1].getKupac().getNaziv());
	
	}

	private static Racunalo kreirajRacunalo(String model, boolean ispravno, int RAM, float brzinaProcesora,
			double cijena) {

		Racunalo racunalo = new Racunalo();
		racunalo.setModel(model);
		racunalo.setIspravno(ispravno);
		racunalo.setRAM(RAM);
		racunalo.setBrzinaProcesora(brzinaProcesora);
		racunalo.setCijena(cijena);
		return racunalo;
	}

	private static Racun kreirajRacun(Date datum, float iznos, Kupac kupac) {

		Racun racun = new Racun();
		racun.setDatum(datum);
		racun.setIznos(iznos);
		racun.setKupac(kupac);
		return racun;
	}

	private static Kupac kreirajKupca(String naziv, String adresa) {
		Kupac kupac = new Kupac();
		kupac.setNaziv(naziv);
		kupac.setAdresa(adresa);
		return kupac;
	}
}
