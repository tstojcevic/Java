package edunova;

import javax.swing.JOptionPane;

public class Z03 {
	
	public static void main(String[] args) {
		
		// Korisnik unosi 5 brojeva
		// program ispisuje najveći
		
		int broj,brojac=0,najveciBroj=Integer.MIN_VALUE;
		
		while (brojac<5) {
			
			broj = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj"));
				
				if (broj>najveciBroj) {
					najveciBroj=broj;
				}
				brojac++;
		}
		System.out.println(najveciBroj);
		
	}

}
