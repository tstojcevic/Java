package edunova;

import javax.swing.JOptionPane;

public class Z02 {
	
	// Metoda od korisnika traži
		// unos broja između 1 i 10
		// te vraća ispravno unesen broj
	
	public static int broj (int a) {
		
		while(true) {
			
			a = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj između 1 i 10"));
			
			if (a>=1 && a<=10) {
				return a;
			}
		}
		
		
	}

}
