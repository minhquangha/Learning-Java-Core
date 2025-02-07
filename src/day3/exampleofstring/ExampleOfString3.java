package day3.exampleofstring;

public class ExampleOfString3 {
    public static void main(String[] args) {
        String s1 ="tItv";
        String s2 = ".vn";
        String s3 = s1+s2;
        //Hàm concat
        String s4=s1.concat(s2);
        System.out.println(s3);
        System.out.println(s4);

        //Hàm replace => Thay thế
        String s5="Tung.vn";
        String s6=s5.replaceAll("Tung","TITV");
        System.out.println(s5);
        System.out.println("s6= "+s6);

        //toLowerCase =>Chuyển về viết thường
        //toUpperCase =>Chuyển về viết hoa
        //trim => xóa khoảng trắng dư thừa ở đầu chuỗi
        //subString =>Cắt chuỗi
        String s7=s6.substring(2);
        String s8=s6.substring(0,2);
        System.out.println(s7);
        System.out.println(s8);
    }
}
