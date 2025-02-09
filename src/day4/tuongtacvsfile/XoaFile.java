package day4.tuongtacvsfile;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class XoaFile {

    public static void xoaFile(File file) {
        if(file.isFile()) {
            file.delete();
        } else if (file.isDirectory()) {
            File [] files = file.listFiles();
            for(File f: files) {
                //Xoa cac file con
                xoaFile(f);
            }
            //Xoa ban than thu muc
            file.delete();
        }
    }

    public static void xoaFile(Path path) {
        File file = path.toFile();
        File [] files = file.listFiles();
        if(files.length == 0) {
           try{
               Files.deleteIfExists(path);
           }catch(IOException e) {
               e.printStackTrace();
           }
        }else{
            xoaFile(file);
        }
    }
    public static void main(String[] args) {
        File file=  new File("C:\\Users\\minhq\\IdeaProjects\\Java Core\\src\\day4\\tuongtacvsfile\\vidu1.txt");
        File fileNew = new File("C:\\Users\\minhq\\IdeaProjects\\Java Core\\src\\day4\\tuongtacvsfile\\vidu2.txt");
        File file3 = new File("C:\\Users\\minhq\\IdeaProjects\\Java Core\\src\\day4\\tuongtacvsfile\\taptin");
       try{
           fileNew.createNewFile();
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
       file3.deleteOnExit();

        Path p = FileSystems.getDefault().getPath(file.getAbsolutePath());
        Path p1 = file.toPath();
        try{
            Files.deleteIfExists(p);
        }
        catch(IOException e) {
            e.printStackTrace();
        }

    }
}
