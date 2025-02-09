package day4.tuongtacvsfile;

import java.io.File;
import java.util.Scanner;

public class ViDuFile {
    protected File file;

    public ViDuFile(String tenFile) {
        this.file = new File(tenFile);
    }
    public boolean kiemTraThucThi(){
        return this.file.canExecute();
    }
    public boolean kiemTraFileCoTheDoc(){
        return this.file.canRead();
    }
    public boolean kiemTraFileCoTheGhi(){
        return this.file.canWrite();
    }
    public void inDuongDan(){
        System.out.println(this.file.getAbsolutePath());
    }
    public void inTenFile(){
        System.out.println(this.file.getName());
    }
    public void kiemTraThuMucHayTepTin(){
        if(this.file.isFile()){
            System.out.println("Đây là một tệp tin");
        } else if (this.file.isDirectory()) {
            System.out.println("Đây là một thư mục");
        }
    }

    public void inDanhSachCacFileCon(){
        if(this.file.isDirectory()){
            System.out.println("Các tập tin con/ thư mục con là:");
            File[] files = file.listFiles();
            for(File f : files){
                System.out.println(file.getAbsolutePath());
            }
        } else if (this.file.isFile()) {
            System.out.println("Đây là tập tin, không có dữ liệu con bên trong.");

        }
    }

    public void inChiTietCayThuMuc(File f, int bac){
        for (int i = 0; i < bac; i++) {
            System.out.print("\t");
        }
        System.out.print("|_");
        System.out.println(f.getName());
        if(f.canRead() && f.isDirectory()){
            File [] files = f.listFiles();
            for (File f1 : files) {
                inChiTietCayThuMuc(f1,bac+1);
            }
        }
    }

    public void inRaCayThuMuc(){
        inChiTietCayThuMuc(file,1);
    }



    public static void main(String[] args) {
        int luaChon=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the file name:" );
        String tenFile=sc.nextLine();

        ViDuFile viDuFile=new ViDuFile(tenFile);
        do {
            System.out.println("MENU -------");
            System.out.println("1. Kiểm tra file có thể thực thi");
            System.out.println("2. Kiểm tra file có thể đọc");
            System.out.println("3. Kiểm tra file có thể ghi");
            System.out.println("4. In đường dẫn: ");
            System.out.println("5. In tên file");
            System.out.println("6. Kiểm tra file là thư mục hoặc tệp tin:  ");
            System.out.println("7.In ra danh sach cac file con: ");
            System.out.println("8. In ra cây thư mục:");
            System.out.println("0. Thoát chương trình: ");
            luaChon=sc.nextInt();
        }while(luaChon==0);

        switch(luaChon){
            case 1:
                System.out.println(viDuFile.kiemTraFileCoTheDoc());
                break;
            case 2:
                System.out.println(viDuFile.kiemTraFileCoTheGhi());
                break;
            case 3:
                System.out.println(viDuFile.kiemTraThucThi());
                break;
            case 4:
                viDuFile.inDuongDan();
                break;
            case 5:
                viDuFile.inTenFile();
                break;
            case 6:
                viDuFile.kiemTraThuMucHayTepTin();
                break;
            case 7:
                viDuFile.inDanhSachCacFileCon();
                break;
            case 8:
                viDuFile.inRaCayThuMuc();
                break;
            default:
                break;
        }


    }
}
