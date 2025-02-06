package Day2.inheritance.hinh;

public class HinhChuNhat extends Hinh {
    protected double chieuRong;
    protected double chieuCao;
    public HinhChuNhat(double chieuRong, double chieuCao,ToaDo ToaDo) {
        super(ToaDo);
        this.chieuRong = chieuRong;
        this.chieuCao = chieuCao;
    }
    @Override
    public double tinhDienTich() {
        return this.chieuRong * this.chieuCao;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }
}
