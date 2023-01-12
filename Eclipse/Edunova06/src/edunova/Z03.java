package edunova;

import javax.swing.JOptionPane;

public class Z03 {
	
	// Metoda prima ime i prezime
		// Metoda vraća ukupan zbroj znakova
		// primljenih imena i prezimena
	
	public static int zbroj (String ime, String prezime) {
		
		ime = JOptionPane.showInputDialog("Unesite ime");
		
		prezime = JOptionPane.showInputDialog("Unesite prezime");
		
		return ime.length() + prezime.length();
	}

}
