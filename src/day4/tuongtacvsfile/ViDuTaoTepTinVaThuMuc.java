package day4.tuongtacvsfile;

import java.io.File;
import java.io.IOException;

public class ViDuTaoTepTinVaThuMuc {
    public static void main(String[] args) {
        //Lưu ý Ms Window \=> \\
        //Linus,MacOs: /
        File folder1 = new File("C:\\Users\\minhq\\IdeaProjects\\Java Core\\src\\day4\\tuongtacvsfile");
        //Kiểm tra thư mục hoặc tệp tin có tồn tại hay không
        File folder2 = new File("C:\\Users\\minhq\\IdeaProjects\\java68");
        System.out.println("Kiểm tra folder 1 có tồn tại hay không?: " +folder1.exists());
        System.out.println("Kiểm tra folder 2 có tồn tại hay không?: " +folder2.exists());

        // Tạo thư mục
        //Phương thức mkdir()
        File d1 = new File("C:\\Users\\minhq\\IdeaProjects\\Java Core\\src\\day4\\tuongtacvsfile\\text");
        d1.mkdir();

        //Phương thức mkdirs()=> Tạo nhiều thư mục cùng lúc
        File d2 = new File("C:\\Users\\minhq\\IdeaProjects\\Java Core\\src\\day4\\tuongtacvsfile\\text\\text1\\text2");
        d2.mkdirs();

        //Tạo tập tin có phần mở rộng(.exe,.txt,.doc,.xls ...)
        File file1 = new File("C:\\Users\\minhq\\IdeaProjects\\Java Core\\src\\day4\\tuongtacvsfile\\vidu1.txt");
        try{
            file1.createNewFile();
        }catch (IOException e){
            //Không có quyền tạo tệp tin
            //Ổ cứng bị đầy
            //Đường dẫn sai
            e.printStackTrace();
        }
    }
}
