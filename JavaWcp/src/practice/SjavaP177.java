package practice;

public class SjavaP177 {
	public static void main(String[] args) {
		int[] numbers = {3, 4, 9};
		System.out.println("一桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		for (int i = 0; i < 3; i++) {
			if (numbers[i] == input) {
				System.out.println("正解");
			} else {
				System.out.println("不正解");
			}
		}
		
	}
}
