package vandat.hueic.edu.vn;

public class HinhKhoi2 extends HinhKhoi1 {
    protected double chieurong;

    public HinhKhoi2(double chieucao, double chieudai, double chieurong) {
        super(chieucao, chieudai);
        this.chieurong = chieurong;
    }

    public HinhKhoi2() {
        this.chieurong = 0;
    }

    public double getChieurong() {
        return chieurong;
    }

    public void setChieurong(double chieurong) {
        this.chieurong = chieurong;
    }
    @Override
    public double TheTichHinhKhoi(){
        return chieucao * chieudai * chieurong;
    }

    @Override
    public String toString() {
        return super.toString() + "\nChiều rộng: " + chieurong;
    }
}
