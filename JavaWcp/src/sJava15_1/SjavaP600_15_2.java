package sJava15_1;

public class SjavaP600_15_2 {
	public static void main(String[] args) {
	  }

	public String concatPath(String folder, String file) {
	  if (!folder.endsWith("\\")) {
	    folder += "\\";
	  }
	  return folder + file;
	}
}
