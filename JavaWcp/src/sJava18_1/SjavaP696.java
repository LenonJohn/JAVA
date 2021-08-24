package sJava18_1;

import java.io.FileWriter;

public class SjavaP696 {
	public static void main(String[] args) {
		FileWriter fw = new FileWriter("data.txt");
		fw.write("そ");
		fw.write("れ");
		fw.write("で");
		fw.write("は");
		fw.close();
	}
}
