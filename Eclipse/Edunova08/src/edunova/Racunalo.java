package edunova;

public class Racunalo {
	
	// 1. zadatak 
		// Kreirati klasu Racunalo
		// Definirati minimalno 5 svojstava 
		// različitih tipova podataka
	
	private String model;
	private boolean ispravno;
	private int RAM;
	private float brzinaProcesora;
	private double cijena;
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public boolean isIspravno() {
		return ispravno;
	}
	public void setIspravno(boolean ispravno) {
		this.ispravno = ispravno;
	}
	public int getRAM() {
		return RAM;
	}
	public void setRAM(int rAM) {
		RAM = rAM;
	}
	public float getBrzinaProcesora() {
		return brzinaProcesora;
	}
	public void setBrzinaProcesora(float brzinaProcesora) {
		this.brzinaProcesora = brzinaProcesora;
	}
	public double getCijena() {
		return cijena;
	}
	public void setCijena(double cijena) {
		this.cijena = cijena;
	}
	
	

}
