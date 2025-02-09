package day4.tuongtacvsfile.vidughidoituong;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ViDuGhiDoiTuong {
    public static void main(String[] args) {
        try{
            File file = new File("C:\\Users\\minhq\\IdeaProjects\\Java Core\\src\\day4\\tuongtacvsfile\\vidu2.txt");
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            SinhVien st = new SinhVien("001", "TITV", 2000, 10);
            oos.writeObject(st);
            oos.flush();
            oos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
