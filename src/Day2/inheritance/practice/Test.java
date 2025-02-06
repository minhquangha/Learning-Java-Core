package Day2.inheritance.practice;

public class Test {
    public static void main(String[] args) {
        HangSanXuat  hangSanXuat = new HangSanXuat("Boeing","America");
        MayBay mayBay = new MayBay("tren cao", hangSanXuat,"dau");
        mayBay.layVanToc();
    }
}
