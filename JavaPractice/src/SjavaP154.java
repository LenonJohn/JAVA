
public class SjavaP154 {
	public static void main(String[] args) {
		int[] scores = {20, 30, 40, 50, 80};
		int sum = 0;
		int ave = 0;
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
			sum += scores[i];
		}
		ave = sum / scores.length;
		System.out.println(sum);
		System.out.println(ave);
		System.out.println(scores.length);
	}
}
