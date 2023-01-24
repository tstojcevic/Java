package edunova;

import java.util.Date;

public class Racun {
	
	// 2. Zadatak
		// Kreirati klasu Racun
		// koja ima tri svojstva
		// 1. datum
		// 2. iznos
		// 3. kupac
	
	private Date datum;
	private float iznos;
	private Kupac kupac;
	
	public Date getDatum() {
		return datum;
	}
	public void setDatum(Date datum) {
		this.datum = datum;
	}
	public float getIznos() {
		return iznos;
	}
	public void setIznos(float iznos) {
		this.iznos = iznos;
	}
	public Kupac getKupac() {
		return kupac;
	}
	public void setKupac(Kupac kupac) {
		this.kupac = kupac;
	}
	
	

}
