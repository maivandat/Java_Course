package thanhdnh.hueic.edu.vn;

import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		HangHoa hh = new HangHoa();
		KhachHang kh = new KhachHang();
		//Tiếp tục với các yêu cầu của đề bài
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời bạn nhập username");
		String usn = sc.nextLine();
		System.out.println("Mời bạn nhập password");
		String pass = sc.nextLine();
		if (usn.equals(kh.getUsername()) && pass.equals(kh.getUsername())){
			kh.MuaHang();
		}else {
			System.out.println("Xin lỗi, tài khoản của quý khách không tồn tại trong hệ thống. Xin liên hệ chi nhánh khách hàng gần nhất");
		}
	}
}
