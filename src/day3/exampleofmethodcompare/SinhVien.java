package day3.exampleofmethodcompare;

public class SinhVien implements Comparable<SinhVien> {
    private int maSinhVien;
    private String hoVaTen;
    private String tenLop;
    private double diemTrungBinh;

    public SinhVien(int maSinhVien, String hoVaTen, String tenLop, double diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.tenLop = tenLop;
        this.diemTrungBinh = diemTrungBinh;
    }

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getTen(){
        String s = this.hoVaTen;
        s.trim();
        String ans ="";
        if(s.indexOf(" ")>=0){
            int vitri= s.lastIndexOf(" ");
            ans= s.substring(vitri+1);
            return ans;
        }else{
            return s;
        }
    }
    @Override
    public int compareTo(SinhVien o) {
        //So sanh theo ten
        String tenThis = this.getTen();
        String tenOther = o.getTen();
        return tenThis.compareTo(tenOther);
    }
}
