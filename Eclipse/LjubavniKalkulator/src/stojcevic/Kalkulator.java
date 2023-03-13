package stojcevic;

import java.util.ArrayList;
import java.util.List;

public class Kalkulator {
	
	public static void main(String[] args) {
		
		new Kalkulator();
		
	}
	
	public Kalkulator () {
		
		String ime1, ime2;
		String imenaZajedno;
		
		//pohrana znakova
		List<Character> nizZnakova = new ArrayList<Character>();
		//pohrana brojeva
		List<Integer> nizBrojeva = new ArrayList<Integer>();
		
		ime1 = Pomocno.Unos("Unesi prvo ime").replaceAll("\\s", "");
		
		ime2 = Pomocno.Unos("Unesi drugo ime").replaceAll("\\s", "");
		
		
		
	}

}
