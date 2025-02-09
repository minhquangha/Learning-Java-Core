package day4.tuongtacvsfile;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class ViDuDocText {
    public static void main(String[] args) {
        File f = new File ("C:\\Users\\minhq\\IdeaProjects\\Java Core\\src\\day4\\tuongtacvsfile\\vidu2.txt");
        //Cach 1
//        try{
//            BufferedReader br  = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
//            String line = null;
//            while(true){
//                line=br.readLine();
//                if(line==null){
//                    break;
//                }else{
//                    System.out.println(line);
//                }
//            }
//        }catch(Exception e){
//            e.printStackTrace();
//        }

        //cach2
        try{
            List<String> allText = Files.readAllLines(f.toPath(),StandardCharsets.UTF_8);
            for(String line : allText){
                System.out.println(line);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
