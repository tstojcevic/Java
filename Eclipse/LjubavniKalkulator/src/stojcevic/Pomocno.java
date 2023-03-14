package stojcevic;

import java.util.List;

import javax.swing.JOptionPane;

public class Pomocno {
	
	public static String Unos(String poruka) {
		while (true) {
			try {
				String unos = JOptionPane.showInputDialog(poruka);
				if (unos.length() > 0) {
					return unos;
				}
				throw new Exception();

			} catch (Exception e) {
				JOptionPane.showInternalMessageDialog(null, "Obavezan unos imena");
			}
		}
	}
	
	public static int prebrojiZnakove(char znak, List<Character> ukupnoZnakova) {
		int dupliZnak = 0;
		for (char pojediniZnak : ukupnoZnakova) {
			if (pojediniZnak == znak) {
				dupliZnak++;
			}
		}
		return dupliZnak;
	}

}
