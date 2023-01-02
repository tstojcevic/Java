package edunova;

import javax.swing.JOptionPane;

public class Z01 {
	
	public static void main(String[] args) {
		
		// Korisnik unosi dva cijela broja
		 // Program ispisuje 
		 // zbroj svih parnih brojeva
		 // između dva unesena broja
		
	int prviBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
	
	int drugiBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
	
	int zbroj = 0;
	
	for (int i = prviBroj; i <= drugiBroj; i++) {
		
		if (i % 2 ==0) {
			
			zbroj += i;
		}
	}
	System.out.println(zbroj);
		
	}

}
