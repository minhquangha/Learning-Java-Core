package day3.enumtype;

public class Test {
    public static void main(String[] args) {
        ThoiKhoaBieu thoiKhoaBieu = new ThoiKhoaBieu(Date.Monday,"Toán Lý Anh");
        ThoiKhoaBieu thoiKhoaBieu1 = new ThoiKhoaBieu(Date.Thursday,"Toán Lý Hóa");
        ThoiKhoaBieu thoiKhoaBieu2 = new ThoiKhoaBieu(Date.Wednesday,"Toans Văn Anh");
        System.out.println(thoiKhoaBieu.toString());
    }
}
