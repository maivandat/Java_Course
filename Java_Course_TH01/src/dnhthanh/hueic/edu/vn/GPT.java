package dnhthanh.hueic.edu.vn;

public class GPT {

	public static void thuchien(float a, float b, float c) {
		//Viết nội dung giải phương trình bậc 2 vào đây
		float delta;
		float x = 0, x1 = 0, x2 = 0, x3 = 0;
		delta = b * b - 4 * a * c;
		if (a == 0) {
			if (b == 0) {
				if (c == 0){
					System.out.println("Phương trình vô số nghiệm");
				}else {
					System.out.println("Phương trình vô nghiệm");
				}
			}else {
				x = (-c) / a;
				System.out.println("Phương trình có nghiệm: " + x);
			}
		}else {
			if (delta == 0){
				x3 = (-b) / (2 * a);
				System.out.println("Phương trình có một nghiệm: ");
			}else if (delta > 0){
				x1 = -b + ((float)Math.sqrt(delta)) / (2 * a);
				x2 = -b - ((float)Math.sqrt(delta)) / (2 * a);
				System.out.println("Phương trình có 2 nghiệm phân biệt");
				System.out.println("x1 =" + x1);
				System.out.println("x2 =" + x2);
			}else {
				System.out.println("Phương trình vô nghiệm");
			}
		}
	}
}

