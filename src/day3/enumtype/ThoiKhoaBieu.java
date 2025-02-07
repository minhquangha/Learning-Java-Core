package day3.enumtype;

public class ThoiKhoaBieu {
    private Date thu;
    private String monHoc;

    public ThoiKhoaBieu(Date thu, String monHoc) {
        this.thu = thu;
        this.monHoc = monHoc;
    }

    public Date getThu() {
        return thu;
    }

    public void setThu(Date thu) {
        this.thu = thu;
    }

    public String getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }

    @Override
    public String toString() {
        return "ThoiKhoaBieu{" +
                "thu=" + thu +
                ", monHoc='" + monHoc + '\'' +
                '}';
    }
}
