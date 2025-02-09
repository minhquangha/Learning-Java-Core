package day4.tuongtacvsfile.vidudocdoituong;

import day4.tuongtacvsfile.vidughidoituong.SinhVien;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class ViDuDocDoiTuong {
    public static void main(String[] args) {
        try{
            File file = new File("C:\\Users\\minhq\\IdeaProjects\\Java Core\\src\\day4\\tuongtacvsfile\\vidu2.txt");
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);

            SinhVien st =(SinhVien) ois.readObject();
            System.out.println(st.getDiemTrungBinh());
            System.out.println(st);
            ois.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
