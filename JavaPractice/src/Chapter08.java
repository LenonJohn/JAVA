
public class Chapter08 {
	public static void main(String[] args) {
		int num1 = 1;
		while (num1 < 5) {
			System.out.println(num1 * num1);
			num1++;
		}
		
		int num[] = {1, 4, 14, 25};
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		for (int val : num) {
			if (val % 2 == 0) {
				continue;
			}
			System.out.println(val);
		}
	}
}
