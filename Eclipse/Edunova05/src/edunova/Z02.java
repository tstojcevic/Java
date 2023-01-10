package edunova;

import javax.swing.JOptionPane;

public class Z02 {
	
	public static void main(String[] args) {
		
		// Korisnik unosi 5 brojeva
		// između 2 i 4
		// Program ispisuje njihov umnožak
		
		int umnozak = 1;
		int broj, brojac=0;
		
		while (brojac<5) {
			broj = Integer.parseInt(JOptionPane.showInputDialog("Unesite 5 brojeva između 2 i 4"));
			
			if (broj>=2 && broj<=4) {
				umnozak*=broj;
				brojac++;
			}
		}
		System.out.println(umnozak);
	}

}
