package thanhdnh.hueic.edu.vn;

public class HangHoa {
	private String tenhang;
	//Tiếp tục cho các thuộc tính còn lại

	private int ngaysanxuat;
	private double dongia;
	private int soluong;

	public String getTenHang() {
		return tenhang;
	}

	public void setTenHang(String th) {
		tenhang = th;
	}
	//Tiếp tục cho các phương thức còn lại

	public int getNgaySanXuat() {
		return ngaysanxuat;
	}

	public void setNgaySanXuat(int nsx) {
		ngaysanxuat = nsx;
	}

	public double getDonGia() {
		return dongia;
	}

	public void setDonGia(double dg) {
		dongia = dg;
	}

	public int getSoLuong() {
		return soluong;
	}

	public void setSoLuong(int sl) {
		soluong = sl;
	}

	public double TinhTien(){
		return dongia * soluong;
	}

	public HangHoa(String th, int nsx, double dg, int sl) {
		tenhang = th;
		ngaysanxuat = nsx;
		dongia = dg;
		soluong = sl;
	}

	public HangHoa() {
	}
}
