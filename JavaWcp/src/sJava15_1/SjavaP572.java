package sJava15_1;

public class SjavaP572 {
	public static void main(String[] args) {
		String s = "abc,def:ghi";
		String[] words = s.split("[,:]");
		for (String w : words) {
			System.out.println(w + "->");
		}
	}
}