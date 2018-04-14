package thanhdnh.hueic.edu.vn;

import java.util.Scanner;

public class KhachHang {
	private String username;
	//Tiếp tục cho các thuộc tính khác

	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String usn) {
		username = usn;
	}
	//Tiếp tục cho các phương thức

	public String getPassword() {
		return password;
	}

	public void setPassword(String pw) {
		password = pw;
	}

	public KhachHang(String usn, String pw) {
		username = usn;
		password = pw;
	}

	public KhachHang() {
		username = "admin";
		username = "admin";
	}

	public void MuaHang() {
		HangHoa hangHoa = new HangHoa();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên hàng");
		String ten = sc.nextLine();
		System.out.println("Nhập ngày sản xuất");
		int ngaysx = sc.nextInt();
		System.out.println("Nhập số lượng");
		int sl = sc.nextInt();
		System.out.println("Nhập Đơn giá");
		double dg = sc.nextDouble();
		hangHoa.setTenHang(ten);
		hangHoa.setNgaySanXuat(ngaysx);
		hangHoa.setSoLuong(sl);
		hangHoa.setDonGia(dg);
		System.out.println("Thành tiền = " + hangHoa.TinhTien());
	}
}
