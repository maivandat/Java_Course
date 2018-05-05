package dnhthanh.hueic.edu.vn;

public class Round {
	private float R;//Bán kính
	private Point O;//Tâm
	
	public Round() {
		this.R = Math.round(Math.random()*100);
		this.O = new Point();
	}
	
	//Tạo getters và setters cho R và O


	public float getR() {
		return R;
	}

	public void setR(float r) {
		R = r;
	}

	public Point getO() {
		return O;
	}

	public void setO(Point o) {
		O = o;
	}

	//Xét vị trí tương đối điểm với đường tròn: nếu nằm trong - trả về -1; nếu nằm ngoài - trả về 1; nếu nằm trên - trả về 0
	public int ViTriTuongDoiDiemVoiDuongTron(Point A) {
		//bình phương khoảng cách đoạn OA
		float OAbp = (float) Math.sqrt((Math.pow(O.getX() - A.getX(), 2)) + (Math.pow(O.getY() - A.getY(), 2)));
		//xét vị trí tương đối
		if (OAbp == R){
			return 0;
		}else if (OAbp < R){
			return -1;
		}else
			return 1;

	}
}
