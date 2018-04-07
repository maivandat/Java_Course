package dnhthanh.hueic.edu.vn;

public class DaoTu {
	public static String thuchien(String s) {
		String ns = new String();
		//Viết nội dung xử lý xâu s cho ra xâu ns, trong đó ns là xâu đảo từ.
		char []s1 = s.toCharArray();
		for (int i = s1.length - 1; i >= 0; i--){
			ns += s1[i];
		}
		return ns;
	}
}
