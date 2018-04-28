package vandat.hueic.edu.vn;

public class HinhKhoi3 extends HinhKhoi {
    protected double bankinh;

    public HinhKhoi3(double chieucao, double bankinh) {
        super(chieucao);
        this.bankinh = bankinh;
    }

    public HinhKhoi3() {
        this.bankinh = 0;
    }

    public double getBankinh() {
        return bankinh;
    }

    public void setBankinh(double bankinh) {
        this.bankinh = bankinh;
    }

    public double TheTichHinhKhoi(){
        return chieucao * Math.PI * (Math.pow(bankinh,2));
    }

    @Override
    public String toString() {
        return super.toString() + "\nBán kình: " +bankinh ;
    }
}
