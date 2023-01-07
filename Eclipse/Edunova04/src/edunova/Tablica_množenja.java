package edunova;

public class Tablica_množenja {
	
	public static void main(String[] args) {
		
		System.out.println("-------------------------------");
		System.out.println(": : :  TABLICA  MNOZENJA  : : :");
		System.out.println("-------------------------------");
		System.out.println("*  | 1  2  3  4  5  6  7  8  9 ");
		System.out.println("-------------------------------");
	
	for (int i=1; i<=9; i++) {
		for (int j=1; j<=9; j++) {
			if(i * j <10) {
				if (j==1) {
					System.out.print(i + "  | " + i * j + "  ");
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
}
}