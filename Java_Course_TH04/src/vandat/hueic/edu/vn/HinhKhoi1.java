package vandat.hueic.edu.vn;

public class HinhKhoi1 extends HinhKhoi {
    protected double chieudai;

    public HinhKhoi1(double chieucao, double chieudai) {
        super(chieucao);
        this.chieudai = chieudai;
    }

    public HinhKhoi1() {
        this.chieudai = 0;
    }

    public double TheTichHinhKhoi(){
        return chieucao * (Math.pow(chieudai,2));
    }

    @Override
    public String toString() {
        return super.toString() + "\nChiều dài: " + chieudai;
    }
}
