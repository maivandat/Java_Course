package vandat.mai.hueic.edu.vn;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Students students = new Students();
        ArrayList<Student> arrayListStudent = new ArrayList<>();
        int luachon;
        arrayListStudent.add(new Student("01", "Hồ Thị A", 1999, false));
        arrayListStudent.add(new Student("02", "Trần Văn B", 1989, true));
        arrayListStudent.add(new Student("03", "Tôn Nữ Đan C", 1996, false));
        arrayListStudent.add(new Student("04", "Trương Văn D", 1997, true));
        arrayListStudent.add(new Student("05", "Lê Thị E", 1987, false));
        students.setStudents(arrayListStudent);

        ArrayList<Employer> arrayListEmployer = new ArrayList<>();
        Employers employers = new Employers();
        arrayListEmployer.add(new Employer("01","Phan Văn Phúc", 1999, true, 5));
        arrayListEmployer.add(new Employer("02","Phạm Trọng Hòa", 1997, true, 7));
        arrayListEmployer.add(new Employer("03","Mai Văn Đạt", 1999, true, 10));
        arrayListEmployer.add(new Employer("04","Hồ Tuân", 1999, true, 9));
        arrayListEmployer.add(new Employer("05","Trần Viết Bảo", 1999, true, 2));
        employers.setEmployers(arrayListEmployer);

        do {
            System.out.println("1. Tìm theo tên Học Sinh");
            System.out.println("2. Tìm theo tuổi Học Sinh");
            System.out.println("3. Tìm theo giới tính Học Sinh Nam");
            System.out.println("4. Tìm theo giới tính Học Sinh nữ");
            System.out.println("5. Tìm nhân viên theo lương");
            System.out.println("6. Thoát chương trình");
            System.out.println("Nhập lựa chọn");
            luachon = new Scanner(System.in).nextInt();

            switch (luachon)
            {
                case 1:
                    System.out.println("Nhập vào tên cần tìm kiếm");
                    String ten = new Scanner(System.in).nextLine();
                    System.out.println(students.TimKiem(ten));
                break;

                case 2:
                    System.out.println("Nhập số đầu");
                    int dau = new Scanner(System.in).nextInt();
                    System.out.println("Nhập số cuối");
                    int cuoi = new Scanner(System.in).nextInt();
                    System.out.println(students.Timkiem(dau, cuoi));
                break;
                case 3:
                    System.out.println("Các học sinh có giới tính nam là: \n");
                    System.out.println(students.TimKiem(true));

                break;
                case 4:
                    System.out.println("Các học sinh có giới tính nữ là: \n");
                    System.out.println(students.TimKiem(false));
                break;
                case 5:{
                    System.out.println("Nhập số đầu");
                    int dau1 = new Scanner(System.in).nextInt();
                    System.out.println("Nhập số cuối");
                    int cuoi1 = new Scanner(System.in).nextInt();
                    System.out.println(employers.TimKiem(dau1, cuoi1));
                    break;
                }
            }
           if (luachon == 6)
               break;
        }while (true);
    }

}
