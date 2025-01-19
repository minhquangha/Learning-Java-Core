package Day1.quanlybophim;

public class App {
    public static void main(String[] args) {
        Date date1 = new Date(15, 05, 2022);
        Date date2 = new Date(16, 05, 2022);
        Date date3 = new Date(17, 05, 2022);

        Company company1 = new Company("Hãng A", "Việt Nam");
        Company company2 = new Company("Hãng B", "Mỹ");
        Company company3 = new Company("Hãng C", "Ba Lan");

        Film film1 = new Film("Bố Già", 2020,company1, 65000,date1 );
        Film film2 = new Film("Running Man", 2021, company2, 100000, date2);
        Film film3 = new Film("Khám phá Ba Lan", 2025, company3, 115000, date3);

        System.out.println("So sanh film 1 va film 2: "+ film1.cheaperPrice(film2));
        System.out.print("Ten hang san xuat film 1 ");
        film1.printNameCompany();
        System.out.println("Film1 giam gia 10%:" + film1.discount(10));

    }
}
