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
			HangHoa hangHoa = new HangHoa();
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Nhập tên hàng");
			String ten = sc1.nextLine();
			System.out.println("Nhập ngày sản xuất");
			int ngaysx = sc1.nextInt();
			System.out.println("Nhập số lượng");
			int sl = sc1.nextInt();
			System.out.println("Nhập Đơn giá");
			double dg = sc1.nextDouble();
			kh.MuaHang(ten, ngaysx, dg, sl);
			hh.toString();
		}else {
			System.out.println("Xin lỗi, tài khoản của quý khách không tồn tại trong hệ thống. Xin liên hệ chi nhánh khách hàng gần nhất");
		}
	}
}
