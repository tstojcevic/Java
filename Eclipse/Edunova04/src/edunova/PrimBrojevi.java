package edunova;

import javax.swing.JOptionPane;

public class PrimBrojevi {

	public static void main(String[] args) {

//		Kreirati program koji za dva unesena broja ispisuje sve prim brojeve između njih.

		int prviBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesite prvi broj"));

		int drugiBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesite drugi broj"));


		for (int i = prviBroj; i < drugiBroj; i++) {
			int brojac = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					brojac++;
					break;
				}
			}
			if (brojac == 0 && i != 1 )
				System.out.println(i);
		}

	}

}
