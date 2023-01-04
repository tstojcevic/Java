package edunova;

import javax.swing.JOptionPane;

public class Matrica_4x4 {
	
	public static void main(String[] args) {
		
//		Keirati program koji unosi dvije matrice 4x4 te ispisuje njihov zbroj
		
		int matrica1[][] = new int [4][4];
		int matrica2[][] = new int [4][4];
		int zbrojMatrica[][] = new int [4][4];
		
		for (int i = 0; i < 4; i++ ) {
			for ( int j =0; j < 4; j++) {
				matrica1[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Unesite brojeve u 1. matricu:"));
				System.out.print(matrica1 [i][j]+ "\t ");
			}
			System.out.println();
		}System.out.println("____________________________");
		for (int i = 0; i < 4; i++ ) {
			for ( int j =0; j < 4; j++) {
				matrica2[i][j]= Integer.parseInt(JOptionPane.showInputDialog("Unesite brojeve u 2. matricu;"));
				System.out.print(matrica2[i][j] + "\t ");
			}
			System.out.println();
	}System.out.println("____________________________");
	for (int i = 0; i < 4; i++ ) {
		for ( int j =0; j < 4; j++) {
			zbrojMatrica[i][j] = matrica1 [i][j] + matrica2 [i][j];
			System.out.print(zbrojMatrica [i][j] + "\t ");
		}
		System.out.println();
	}
	}
}