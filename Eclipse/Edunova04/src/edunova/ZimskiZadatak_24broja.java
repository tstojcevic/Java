package edunova;

import javax.swing.JOptionPane;

public class ZimskiZadatak_24broja {

	public static void main(String[] args) {

//		Kreirati program koji unosi 24 broja, ispisuje njihov zbroj, najmanji i  najveći uneseni broj

		
		int niz[] = new int[4];
		
		int zbroj = 0;

		for (int i = 0; i < niz.length; i++) {
			niz[i] = Integer.parseInt(JOptionPane.showInputDialog("Unesi " + (i + 1) + ". broj"));
			
			zbroj += niz[i];

		} System.out.println("Zbroj unesenih brojeva iznosi: " +zbroj);
		
		
		int najmanjiBroj = niz[0];
		
		int najvećiBroj = niz[0];
		
		for (int i = 0; i <niz.length; i++) {
			
			if (niz[i] < najmanjiBroj) {
				najmanjiBroj = niz[i];
			}else if (niz[i] > najvećiBroj) {
				najvećiBroj = niz[i];
			}
		}
		System.out.println("Najmanji uneseni broj je: " + najmanjiBroj);
		System.out.println("Najveći uneseni broj je: " + najvećiBroj);

	}

}
