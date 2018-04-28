package dnhthanh.hueic.edu.vn;

public class Point {
	private float x;//Tọa độ x
	private float y;//Tọa độ y
	
	public Point() {
		this.x = Math.round(Math.random()*50);
		this.y = Math.round(Math.random()*50);
	}
	
	//Tạo getters và setters cho x và y

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

}
