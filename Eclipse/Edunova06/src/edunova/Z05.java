package edunova;

public class Z05 {

	// Metoda prima dva decimalna broja
	// metoda vraća zbroj samo
	// decimalnih vrijednosti

	// 3.14, 1.12
	// 0.26

	// 2.78, 0.30
	// 1.08

	public static float zbroj(float a, float b) {

		float prviBroj = 0, drugiBroj = 0;

		while (a >= 1) {
			prviBroj = a % 10;
			a = a / 10;
		}
		while (b >= 1) {
			drugiBroj = b % 10;
			b = b / 10;
		}

		return prviBroj + drugiBroj;
	}

}
