package day3.minigame;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/*
 * Một người chơi sẽ có tài khoản. Người chơi có quyền đặt cược số tiền ít hơn hoặc bằng
 * số tiền họ đang có.
 * Luật chơi như sau:
 * Có 3 viên xúc xắc. Mõi viên xúc có 6 mặt có giá tị từ 1 đến 6.
 * Mỗi lần lắc sẽ ra một kết quả. Kết quả = giá trị xx1 + giá trị xx2 + giá xx3
 * 1. Nếu tổng = 3 hoặc 18 => Cái ăn hết, người chơi thua.
 * 2. Nếu tổng = (4->10) <-> xỉu => nếu người chơi đặt xỉu thì người chơi thắng, ngược lại thua
 * 3. Nếu tổng = (11-17) <-> tài => nếu người chơi đặt xỉu thì người chơi thắng, ngược lại thua
 */
public class TaiXiu {
    public static void main(String[] args) {
        double taiKhoanNguoiChoi=50000;
        Scanner sc = new Scanner(System.in);
        Locale lc = new Locale("en", "US");
        NumberFormat numf = NumberFormat.getCurrencyInstance(lc);
        int luaChon=1;
        do{
            System.out.println("------------MỜI BẠN LỰA CHỌN -------------");
            System.out.println("Chọn (1) để tiếp tục choi");
            System.out.println("Chọn phím bất kì để thoát");
            luaChon=sc.nextInt();
            if(luaChon==1){
                System.out.println("*** BẮT ĐẦU");
                System.out.println("***** Tài khoản của bạn: "+numf.format(taiKhoanNguoiChoi)+", bạn muốn cược bao nhiêu?");
                double datCuoc=0;
                do{
                     datCuoc = sc.nextDouble();
                    System.out.println("Bạn đã đặt: " + numf.format(datCuoc));

                }while(datCuoc> taiKhoanNguoiChoi && datCuoc<0);
                int luaChonTaiXiu=0;
                do{
                    System.out.println("Chọn (1) tài (2) xỉu");
                    int luaChon1 = sc.nextInt();
                    if(luaChon1==1){
                        luaChonTaiXiu=1;
                    } else if (luaChon1==2) {
                        luaChonTaiXiu=2;
                    }
                }while(luaChonTaiXiu!=1 && luaChonTaiXiu!=2);

                //Tung xuc sac
                Random xucSac1= new Random();
                Random xucSac2= new Random();
                Random xucSac3= new Random();

                int giaTri1 =xucSac1.nextInt(5)+1;
                int giaTri2 =xucSac2.nextInt(5)+1;
                int giaTri3 =xucSac3.nextInt(5)+1;
                int tong = giaTri1+giaTri2+giaTri3;

                //Tính toán kết quả
                System.out.println("****** Kết quả: " + giaTri1 + " - " + giaTri2 + " - " + giaTri3);
                if (tong == 3 || tong == 18) {
                    taiKhoanNguoiChoi -= datCuoc;
                    System.out.println("****** Tổng là: " + tong + " => Nhà cái ăn hết, bạn đã thua!");
                    System.out.println("****** Tài khoản của bạn là: " + taiKhoanNguoiChoi);
                } else if (tong >= 4 && tong <= 10) {
                    System.out.println("****** Tổng là: " + tong + " => Xỉu");
                    if (luaChonTaiXiu == 2) {
                        System.out.println("****** Bạn đã thắng cược");
                        taiKhoanNguoiChoi += datCuoc;
                        System.out.println("****** Tài khoản của bạn là: " + numf.format(taiKhoanNguoiChoi));
                    } else {
                        System.out.println("****** Bạn đã thua cược");
                        taiKhoanNguoiChoi -= datCuoc;
                        System.out.println("****** Tài khoản của bạn là: " + numf.format(taiKhoanNguoiChoi));
                    }
                } else {
                    System.out.println("****** Tổng là: " + tong + " => Tài");
                    if (luaChonTaiXiu == 1) {
                        System.out.println("****** Bạn đã thắng cược");
                        taiKhoanNguoiChoi += datCuoc;
                        System.out.println("****** Tài khoản của bạn là: " + numf.format(taiKhoanNguoiChoi));
                    } else {
                        System.out.println("****** Bạn đã thua cược");
                        taiKhoanNguoiChoi -= datCuoc;
                        System.out.println("****** Tài khoản của bạn là: " + numf.format(taiKhoanNguoiChoi));
                    }
                }


            }
        }while(luaChon!=1);
    }
}
