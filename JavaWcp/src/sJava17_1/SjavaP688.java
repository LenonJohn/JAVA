package sJava17_1;

public class SjavaP688 {
	public static void main(String[] args) {
		try {
			throw new UnsupportedMusicFileException("未対応のファイル");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
