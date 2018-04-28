package vandat.hueic.edu.vn;

public class HinhKhoi {
    protected double chieucao;

    public HinhKhoi(double chieucao) {
        this.chieucao = chieucao;
    }

    public HinhKhoi() {
        this.chieucao = 0;
    }

    @Override
    public String toString() {
        return "Hình khối: " + "\nChiều cao: " + chieucao;
    }
}
