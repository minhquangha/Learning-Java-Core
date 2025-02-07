package day3.exampleofstring;
//Phương thức kiểm tra lớp String

import java.util.Scanner;

public class ExampleOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Nhap vao chuoi: ");
        s = sc.nextLine();
        System.out.println("------");

        //Ham length
        System.out.println(s.length());
        //Ham charAt
        System.out.println(s.charAt(0));
        //Ham getChars => lấy ra hàng loạt kí tự ở một vị trí chỉ số
        char a[] = new char[s.length()];
        s.getChars(0, s.length(), a, 0);
        for(char c: a){
            System.out.print(c+ " ");
        }
        System.out.println();
        //Ham getBytes => lấy ra số của kí tự trong bảng mã
        byte [] arrByte = s.getBytes();
        for(byte b: arrByte){
            System.out.print(b+ " ");
        }
        System.out.println();

    }
}
