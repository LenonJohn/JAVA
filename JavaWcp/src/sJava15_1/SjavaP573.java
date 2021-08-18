package sJava15_1;

public class SjavaP573 {
	public static void main(String[] args) {
		String s = "abc,def:ghi";
		String w = s.replaceAll("[beh]", "X");
		System.out.println(w);
	}
}
