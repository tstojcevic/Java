package stojcevic;

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

}
