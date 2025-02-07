package day3.libraryoftime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {

        //Hàm lấy thời gian hiện tại System.currenTimeMillis();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1; i++) {
            System.out.println("TEST");
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Truước khi chạy for: "+ startTime + " ms");
        System.out.println("Sau khi chạy for: "+ endTime + " ms");
        System.out.println("Thời gian: "+ (endTime - startTime)/1000+"s");

        //Time Unit
        System.out.println("3000 nam = "+ TimeUnit.DAYS.toSeconds(3000*365)+"s");
        System.out.println("25 gio = "+ TimeUnit.HOURS.toSeconds(25)+ "s");
        System.out.println("100s = "+TimeUnit.SECONDS.toHours(100)+"h");

        //Date
        Date d = new Date(System.currentTimeMillis());
        System.out.println(d.getDate()+"/"+(d.getMonth()+1)+"/"+(d.getYear()+1900));


        //Calendar
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR));
        c.add(Calendar.HOUR,30);
        System.out.println(c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR));

        //DateFormat
        DateFormat df = new SimpleDateFormat();
        System.out.println(df.format(d));

        df = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(df.format(d));
    }
}
