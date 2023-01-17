package edunova;

import javax.swing.JOptionPane;


public class CiklicnaMatrica {
	
	public static void main(String[] args) {
		

//	kreirati cikličnu matricu počevši sa ispisom dolje desno

		int stupac = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj stupaca"));

		int red = Integer.parseInt(JOptionPane.showInputDialog("Unesite broj redova"));

		int matrica[][] = new int[stupac][red];

		int prviStupac = 0;
		int zadnjiStupac = stupac - 1;
		int prviRed = 0;
		int zadnjiRed = red - 1;
	
		int polje = 1;
		
		while (polje <= stupac*red) {
			
			for (int i = zadnjiStupac; i>=prviStupac;i--) {
				matrica [zadnjiRed][i]=polje++;
				
			}if (polje >stupac*red)
					break;
			
			for(int j = zadnjiRed-1; j>=prviRed;j--) {
				matrica [j][prviStupac]=polje++;
				
			}if (polje >stupac*red)
				break;
			
			for (int i = prviStupac+1; i<=zadnjiStupac;i++) {
				matrica [prviRed][i]=polje++;
				
			}if (polje > stupac*red)
				break;
			
			for (int j = prviRed+1; j<zadnjiRed;j++) {
				matrica [j][zadnjiStupac]=polje++;
				
			}if (polje > stupac*red)
				break;
			
			zadnjiRed = zadnjiRed - 1;
			zadnjiStupac = zadnjiStupac - 1;

			prviStupac = prviStupac + 1;
			prviRed = prviRed + 1;
		}
		for (int i = 0; i < red; i++) {

			for (int j = 0; j < stupac; j++) {

				System.out.print(matrica[i][j] + " \t ");


	}
	System.out.println();

}


}
	}


