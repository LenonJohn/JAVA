
public class Main {
	public static void main(String[] args) {
		Hero h = new Hero();
		h.name = "みなと";
		h.hp = 100;
		
		Matago m1 = new Matago();
		m1.hp = 50;
		m1.suffix = 'A';
		
		Matago m2 = new Matago();
		m2.hp =48;
		m2.suffix = 'B';
		
		System.out.println("勇者" + h.name + "を生み出しました");
		
		h.slip();
		m1.run();
		m2.run();
		h.run();
	}
}
