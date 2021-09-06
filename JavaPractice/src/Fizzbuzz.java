
public class Fizzbuzz {
	public static void main(String[] args) {
		for (int i = 1; i < 101; i++) {
			String str = "";
			if (i % 3 == 0) {
				str = str + "fizz";
			}
			if (i % 5 == 0) {
				str = str + "buzz";
			}
			if (str.equals("")) {
				Integer i2 = i;
				str = i2.toString();
			}
			System.out.println(str);
		}
	}
}
