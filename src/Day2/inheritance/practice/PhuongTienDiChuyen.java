package Day2.inheritance.practice;

public abstract class PhuongTienDiChuyen {
    protected String loaiPhuongTien;
    protected HangSanXuat hangSanXuat;
    public PhuongTienDiChuyen(String loaiPhuongTien, HangSanXuat hangSanXuat) {
        this.loaiPhuongTien = loaiPhuongTien;
        this.hangSanXuat = hangSanXuat;
    }
    public String layTenHangSanXuat() {
        return hangSanXuat.getTenHangSanXuat();
    }
    public void  batDau(){
        System.out.println("batDau");
    }
    public void tangToc(){
        System.out.println("tang toc");
    }
    public void dungLai(){
        System.out.println("dung lai");
    }

    public String getLoaiPhuongTien() {
        return loaiPhuongTien;
    }

    public void setLoaiPhuongTien(String loaiPhuongTien) {
        this.loaiPhuongTien = loaiPhuongTien;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public abstract double layVanToc();
}
