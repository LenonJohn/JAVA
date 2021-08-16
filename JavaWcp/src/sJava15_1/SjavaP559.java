package sJava15_1;

public class SjavaP559 {
	public static void main(String[] args) {
		String s1 = "Java and JavaScript";
		
		if (s1.contains("Java")) {
			System.out.println("文字列S1はJavaを含んでいます");
		}
		
		if (s1.endsWith("Java")) {
			System.out.println("文字列S1の文末にJavaがあります。");
		}
		
		System.out.println("文字列S1で最初にJabaが登場する位置は" + s1.indexOf("Java"));
		
		System.out.println("文字列S1で最初にJabaが登場する位置は" + s1.lastIndexOf("Java"));
	}
}
