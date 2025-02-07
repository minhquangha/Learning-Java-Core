package day3.exampleofstring;
//Các hàm tìm kiếm chuỗi trong java
public class ExampleOfString2 {
    public static void main(String[] args) {
        String s1 ="Xin chào cô chú, xin chào các bạn. Xin chào!";
        String s2 ="Xin chào";
        String s3 = "Xin chào 123";
        char c1 = 'o';

        //Hàm indexOf
        System.out.println("Vị trí của s2 trong s1 là: "+ s1.indexOf(s2));
        System.out.println("Vị trí của s3 trong s1 là: "+ s1.indexOf(s3));

        //Sử dụng vị trí bắt đầu
        System.out.println("Vị trí của s2 trong s1 từ vị trí số 2 là: "+ s1.indexOf(s2,2));

        // Tìm kiếm char
        System.out.println("Vị trí của kí tự c1 trong s1 là: "+ s1.indexOf(c1));
        System.out.println("Vị trí của kí tự c1 trong s1 từ vị trí 2 là: "+ s1.indexOf(s2,2 ));

        // lastIndexOf tìm kiếm ngược lại từ phải qua trái (ngược với ha indexOf)

    }
}
