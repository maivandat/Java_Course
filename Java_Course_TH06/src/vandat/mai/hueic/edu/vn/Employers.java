package vandat.mai.hueic.edu.vn;

import java.util.ArrayList;

public class Employers implements IHuman {
    private ArrayList<Employer> employers = new ArrayList<>();

    public ArrayList<Employer> getEmployers() {
        return employers;
    }

    public void setEmployers(ArrayList<Employer> employers) {
        this.employers = employers;
    }

    @Override
    public Object Timkiem(int from, int to) {
        return null;
    }

    @Override
    public Object TimKiem(boolean gt) {
        return null;
    }

    @Override
    public Object TimKiem(String ten) {
        return null;
    }

    public Object TimKiem(double from, double to){
        ArrayList<Employer> arrayList = new ArrayList<>();
        for (int i = 0 ; i < employers.size(); i++){
            if (employers.get(i).TinhLuong() >= from && employers.get(i).TinhLuong() <= to){
                arrayList.add(employers.get(i));
            }
        }
        return arrayList;
    }

}
