package day3.exampleofstring;

import java.util.Arrays;

//Các cách copy mảng
public class ExampleOfArray {
    public static void main(String[] args) {
        //Kiểu nguyên thủy
        int[] mang1={1,2,3};

        //Copy mang cách 1
        int mang1_a [] = mang1;
        mang1_a [0] =100;
        System.out.println("Mảng 1: "+Arrays.toString(mang1));
        System.out.println("Mảng 1_a: "+Arrays.toString(mang1_a));

        //Copy mảng cách2
        int[] mang1_b = mang1.clone();
        mang1_b[0] =200;
        System.out.println("Mảng 1b: "+Arrays.toString(mang1_b));

        //Copy mảng cách 3
        int[] mang1_c=new int[mang1_b.length];
        System.arraycopy(mang1,0,mang1_c,0,mang1.length);
        mang1_c[0] =300;
        System.out.println("mảng1_c: "+Arrays.toString(mang1_c));

        String [] mang_doi_tuong= {"TITV","VN"};
        String [] mang_doi_tuong2= mang_doi_tuong;
        mang_doi_tuong2[0]="a";
        String [] mang_doi_tuong3= mang_doi_tuong.clone();
        mang_doi_tuong3[0]="b";
        String [] mang_doi_tuong4= new String[mang_doi_tuong3.length];
        System.arraycopy(mang_doi_tuong,0,mang_doi_tuong4,0,mang_doi_tuong3.length);
        mang_doi_tuong4[0]="c";
        System.out.println("mang_doi_tuong4: "+Arrays.toString(mang_doi_tuong));
        System.out.println("mang_doi_tuong2: "+Arrays.toString(mang_doi_tuong2));
        System.out.println("Mang_doi_tuong3: "+Arrays.toString(mang_doi_tuong3));
        System.out.println("Mang_dooi_tuong4: "+Arrays.toString(mang_doi_tuong4));
    }
}
