package triangle;

public class Rhombus {

	public static void main(String[] args) {
		int max = 10;
		String star = "*";
		
		for (int i = 0; i < max; i++) {
			for (int j = 0; j < max-i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= ((i-1)*2); k++) {
				System.out.print(star);
			}
			System.out.println("");
			
			if (i == max-1) {
				for (int a = 0; a < max; a++) {
					for (int b = 0; b < a; b++) {
						System.out.print(" ");
					}
					for (int c = 0; c <= max*2-(a*2)-2; c++) {
						System.out.print(star);
					}
					System.out.println("");
				}
			}
		}

	}

}
