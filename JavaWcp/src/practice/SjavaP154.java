package practice;

public class SjavaP154 {
	public static void main(String[] args) {
		int[] scores = {20, 30, 40, 50, 80};
////		単純計算
//		int sum = scores[0] + scores[1] + scores[2] + scores[3] + scores[4];
//		int ave = sum / scores.length;
		
//		for文利用
		int sum = 0;
		for(int i =0; i < scores.length; i++) {
			sum += scores[i];
		}
		int ave = sum / scores.length;
		
//		for文とif文の両用
		int count = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= ave) {
				count++;
			}
		}
		
		
		System.out.println("合計点:" + sum);
		System.out.println("平均点:" + ave);
		System.out.println("平均点以上の科目は" + count + "つ");
	}
}
