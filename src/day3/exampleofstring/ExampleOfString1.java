package day3.exampleofstring;
//Hàm so sánh String
public class ExampleOfString1 {
    public static void main(String[] args) {
        String s1 ="titv.vn";
        String s2 ="TITV.VN";
        String s3 ="titv.vn";
        //Hàm equals => so sánh 2 chuỗi giống nhau (phân biệt hoa thường)
        System.out.println("So sánh s1 vs s2"+s1.equals(s2));
        System.out.println("So sánh s1 vs s3"+s1.equals(s3));
        //Hàm  equalsIgnorgeCase => so sánh không phân biệt hoa thường
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));

        //Hàm compareTo => so sánh >< =
        String sv1= "Nguyễn Văn A";
        String sv2="Nguyễn Văn B";
        String sv3="Nguyễn Văn ";
        String sv4="Nguyễn Văn A";
        System.out.println("sv1 compare to sv2 "+ sv1.compareTo(sv2));
        System.out.println("sv1 compare to sv3 "+ sv1.compareTo(sv3));
        System.out.println("sv2 compare to sv3 "+ sv2.compareTo(sv3));
        System.out.println("sv1 compare to sv4 "+ sv1.compareTo(sv4));

        //Hàm compareToIgnoreCase => Tương tự như haàm compareTo không phân biệt viết hoa viết thường

        //Hàm regionMatches => so sánh một đoan
        String r1 = "TITV.VN";
        String r2 = "TV.V";
        boolean trust = r1.regionMatches(2,r2,0,4);
        System.out.println(trust);

        //Hàm startWith => Hàm kiểm tra chuỗi bắt đầu có bắt đầu bằng chuỗi kiểm tra không
        String sdt = "0371823991";
        System.out.println(sdt.startsWith("037"));

        //Ham endWith => Hàm kiểm tra chuỗi kết thúc bằng chuỗi chỉ định hay không
        String sdt1 = "0129391283";
        System.out.println(sdt1.endsWith("83"));

    }
}
