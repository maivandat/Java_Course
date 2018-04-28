package vandat.hueic.edu.vn;

public class Main {
        public static void main(String[] args) {
            HinhKhoi hk = new HinhKhoi(3.5);
            HinhKhoi1 hk1 = new HinhKhoi1(4.5,3.7);
            HinhKhoi2 hk2 = new HinhKhoi2(3.8,4.7,9);
            HinhKhoi3 hk3 = new HinhKhoi3(5.7,3);
            System.out.println(hk.toString());
            System.out.println(hk1.toString() + "\n" + "Thể tích hình khối 1: " + hk1.TheTichHinhKhoi());
            System.out.println(hk2.toString() + "\n" + "Thể tích hình khối 2: " + hk2.TheTichHinhKhoi());
            System.out.println(hk3.toString() + "\n" + "Thể tích hình khối 3: " + hk3.TheTichHinhKhoi());
        }
    }
