package sJava18_1;

import java.io.FileReader;

public class SjavaP695 {
	public static void main(String[] args) {
		FileReader fr = new FileReader("date.txt");
		int input = fr.read();
		while (input != -1) {
			System.out.print((char)input);
			input = fr.read();
		}
		fr.close();
	}
}
