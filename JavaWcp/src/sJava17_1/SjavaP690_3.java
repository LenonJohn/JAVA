package sJava17_1;

public class SjavaP690_3 {
	public static void main(String[] args) {
		try {
			int i = Integer.parseInt("三");
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException例外をキャッチしました。");
		}
	}
}
