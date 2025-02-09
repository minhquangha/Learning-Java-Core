package day4.queue;

import java.util.LinkedList;
import java.util.Queue;

public class ViDuQueue {
    public static void main(String[] args) {
        Queue<String>danhSachSV = new LinkedList<String>();
        danhSachSV.offer("TITV 1");
        danhSachSV.offer("Nguyen Van A");
        danhSachSV.offer("Nguyen Van B");
        danhSachSV.offer("TITV 2");

        while(danhSachSV.isEmpty() == false) {
            String ten = danhSachSV.poll();
            System.out.println(ten);
        }
    }
}
