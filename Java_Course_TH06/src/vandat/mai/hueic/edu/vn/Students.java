package vandat.mai.hueic.edu.vn;

import java.util.ArrayList;

public class Students implements IHuman {

    private ArrayList<Student> students = new ArrayList<>();

    public ArrayList<Student> getStudents(){
        return students;
    }

    public void setStudents(ArrayList<Student> students){
        this.students = students;
    }

    @Override
    public Object Timkiem(int from, int to) {
        ArrayList<Student> arrayList = new ArrayList<>();
        for (int i = 0; i < students.size(); i++){
            if (students.get(i).TinhTuoi() >= from && students.get(i).TinhTuoi() <= to){
                arrayList.add(students.get(i));
            }
        }
        return arrayList;
    }

    @Override
    public Object TimKiem(boolean gt) {
        ArrayList<Student> arrayList = new ArrayList<>();
        for (int i = 0; i < students.size(); i ++){
            if (students.get(i).getGioitinh() == gt) {
                arrayList.add(students.get(i));
            }
        }
        return arrayList;
    }

    @Override
    public Object TimKiem(String ten) {
        ArrayList<Student> arrayList = new ArrayList<>();
        for (int i = 0 ; i < students.size(); i++){
            if (students.get(i).getHoten().indexOf(ten) >= 0){
                arrayList.add(students.get(i));
            }
        }
        return arrayList;
    }


}
