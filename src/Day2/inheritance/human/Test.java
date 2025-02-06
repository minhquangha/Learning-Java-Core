package Day2.inheritance.human;

public class Test {
    public static void main(String[] args) {
        ConNguoi cn = new ConNguoi("Quang",2022);
        cn.an();
        cn.uong();
        cn.ngu();

        HocSinh hs = new HocSinh("Ronaldo",2022,"10a3","THPT");
        hs.an();
        hs.uong();
        hs.ngu();
        hs.lamBaiTap();
    }
}
