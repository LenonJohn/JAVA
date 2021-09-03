package extend;

import extend.phone.Camera;
import extend.phone.MobilePhone;

public class Interface01 {
	public static void main(String[] args) {
		MobilePhone mp = new MobilePhone("000-1111-2222");
		
		System.out.println("電話番号は最大" + MobilePhone.MAX_NUMBER_DIGITS + "桁です。");
		mp.call("99-8888-7777");
		Interface01.classTakePicture(mp);
	}
	
	public static void classTakePicture(Camera camera) {
		camera.takePicture();
	}
}
