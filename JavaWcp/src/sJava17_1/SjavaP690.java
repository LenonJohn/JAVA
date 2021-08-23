package sJava17_1;

public class SjavaP690 {
	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("ヌルポをcatchしました。");
			System.out.println("---スタックトレースstart---");
			e.printStackTrace();
			System.out.println("---スタックトレースend---");
		}
	}
}
