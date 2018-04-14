package dnhthanh.hueic.edu.vn;

public class DaoTu {
	public static String thuchien(String s) {
		String ns = new String();
		//Viết nội dung xử lý xâu s cho ra xâu ns, trong đó ns là xâu đảo từ.
		char[] s1 = s.toCharArray();
		int dem = 0;
		for (int i = 0; i < s1.length; i++){
			if (s1[i] == ' ' || i == 0){
				dem++;
			}
		}
		System.out.println(dem);
		return ns;
	}
}
