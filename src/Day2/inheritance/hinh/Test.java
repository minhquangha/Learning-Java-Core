package Day2.inheritance.hinh;

public class Test {
    public static void main(String[] args) {
        ToaDo toaDo = new ToaDo(0,0);
        HinhChuNhat hinhChuNhat = new HinhChuNhat(3,4,toaDo);
        System.out.println(hinhChuNhat.tinhDienTich());
    }
}
