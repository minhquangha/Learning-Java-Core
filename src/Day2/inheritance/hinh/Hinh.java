package Day2.inheritance.hinh;

public abstract class Hinh {
    ToaDo toaDo;
    public Hinh(ToaDo toaDo) {
        this.toaDo = toaDo;
    }
    public abstract double tinhDienTich();
}
