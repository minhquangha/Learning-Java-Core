package day4.tuongtacvsfile;
import java.io.FileWriter;
import java.io.PrintWriter;

public class ViDuGhiText {
    public static void main(String[] args) {
        try{
            PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\minhq\\IdeaProjects\\Java Core\\src\\day4\\tuongtacvsfile\\vidu2.txt"));
            pw.println("Xin chao");
            pw.println("quang quá đẹp trai kkkkkkkkk");
            pw.println("quang quá đẹp trai kkkkkkkkk");
            pw.println("quang quá đẹp trai kkkkkkkkk");
            pw.print(3.14);
            pw.flush();
            pw.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
