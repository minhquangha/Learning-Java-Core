package Day1.quanlyhocsinh;

public class Class {
    private String name;
    private String nameKhoa;


    public Class(String name, String nameKhoa) {
        this.name = name;
        this.nameKhoa = nameKhoa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameKhoa() {
        return this.nameKhoa;
    }

    public void setNameKhoa(String nameKhoa) {
        this.nameKhoa = nameKhoa;
    }
}
