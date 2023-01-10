package edunova;

import javax.swing.JOptionPane;

public class Z01 {

	public static void main(String[] args) {

		// while petljom ispisati
		// zbroj prvih 100 brojeva

		int zbroj = 0;
		int broj = 1;

		while (broj <=100) {
			zbroj+= broj++;
		}
		System.out.println(zbroj);
	}

}
