package sJava15_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SjavaP600_15_5 {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDate future = now.plusDays(100);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		System.out.println(future.format(fmt));
	}
}
