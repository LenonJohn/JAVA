package sJava16_1;

import java.util.HashMap;
import java.util.Map;

public class SjavaP635 {
	public static void main(String[] args) {
		Map<String, Integer> prefs = new HashMap<String, Integer>();
		prefs.put("京都府", 255);
		prefs.put("東京都", 1261);
		prefs.put("熊本県", 181);
		
		int tokyo = prefs.get("東京都");
		System.out.println("東京都の人口は" + tokyo + "万人");
		
		int kumamoto = prefs.get("熊本県");
		System.out.println("熊本県の人口は" + kumamoto+ "万人");
		
		int kyoto = prefs.get("京都府");
		System.out.println("京都府の人口は" + kyoto+ "万人");
		
		for (String key : prefs.keySet()) {
			int value = prefs.get(key);
			System.out.println(key + "の人口は" + value + "万人です");
		}
	}
}
