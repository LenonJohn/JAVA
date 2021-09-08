package triangle;

public class RightTriangle {
	public static void main(String[] args) {
		int max = 5;
		String star = "*";
		
		for (int i = 0; i < max; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(star);
			}
			System.out.println("");
		}
	}
}
