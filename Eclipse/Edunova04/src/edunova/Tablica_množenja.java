package edunova;

import javax.swing.JOptionPane;

public class Tablica_množenja {
	
	public static void main(String[] args) {
		
		String ime = JOptionPane.showInputDialog("Tko je kreirao tablicu?");
		
		System.out.println("-------------------------------");
		System.out.println(": : :  TABLICA  MNOZENJA  : : :");
		System.out.println("-------------------------------");
		System.out.println("*  |  1  2  3  4  5  6  7  8  9 ");
		System.out.println("-------------------------------");
	
	for (int i=1; i<=9; i++) {
		for (int j=1; j<=9; j++) {
			if(i * j <=9) {
				if (j==1) {
					System.out.print(i + "  | " + i * j + "  " );
				} else {
					System.out.print(i * j + "  ");
				}				
			}else if (i * j < 100) {
				System.out.print(i * j + " ");
			}else if (i*j >10 && i*j <100) {
				System.out.print(i * j + " ");
			} else {
				System.out.print(i * j +  "  ");
			}
			
		} System.out.println();
		
}System.out.println("-------------------------------");

  switch (ime.length()) {
  case 2:
		System.out.println(":  :  :  :  :  :   :  :  :by " + ime);
		break;

  case 3:
		System.out.println(":  :  :  :  :  :   :  :  by " + ime);
		break;

  case 4:
		System.out.println(":  :  :  :  :  :   :  : by " + ime);
		break;
  case 5:
		System.out.println(":  :  :  :  :  :   :  :by " + ime);
		break;
  case 6:
		System.out.println(":  :  :  :  :  :   :  by " + ime);
		break;
  case 7:
		System.out.println(":  :  :  :  :  :   : by " + ime);
		break;
  case 8:
		System.out.println(":  :  :  :  :  :   :by " + ime);
		break;
  case 9:
		System.out.println(":  :  :  :  :  :   by " + ime);
		break;
  case 10:
		System.out.println(":  :  :  :  :  :  by " + ime);
		break;
  case 11:
		System.out.println(":  :  :  :  :  : by " + ime);
		break;
		
  }System.out.println("-------------------------------");
}
}
