package dnhthanh.hueic.edu.vn;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		int numP = 5;//Số lượng điểm
		int numR = 3;//Số lượng đường tròn
		ArrayList<Point> points = new ArrayList<Point>();//Danh sách điểm
		ArrayList<Round> rounds = new ArrayList<Round>();//Danh sách đường tròn
		
		//Tạo một danh sách điểm
		for(int i=0; i<numP; i++)
			points.add(new Point());
		//Tạo một danh sách đường tròn
		for(int i=0; i<numR; i++)
			rounds.add(new Round());
		//Gọi phương thức xét vị trí tương đối
		for (int i = 0; i < numR; i++) {
			for (int j = 0; j < numP; j++) {
				int KQ;
				KQ = rounds.get(i).ViTriTuongDoiDiemVoiDuongTron(points.get(j));
				if (KQ == 0) {
					System.out.println("Điểm " + (j + 1) + " nằm trên đường tròn " + (i + 1));
				}else if (KQ == -1) {
					System.out.println("Điểm " + (j + 1) + " nằm trong đường tròn " + (i + 1));
				}else if(KQ == 1){
					System.out.println("Điểm " + (j + 1) + " nằm ngoài đường tròn " + (i + 1));
				}
			}
		}
	}

}
