package Day1.quanlysach;

public class App {
    public static void main(String[] args) {
        Date date1 = new Date(2023,5,2021);
        Date date2 = new Date(2023,5,2023);
        Date date3 = new Date(2021,5,2021);

        Author author1 = new Author("John Doe", date1);
        Author author2 = new Author("Jane ", date2);
        Author author3 = new Author("Jack", date3);

        Book book1 = new Book("Lập trình C", 5000, 2023, author1);
        Book book2 = new Book("Lập trình Java", 100, 2022, author2);
        Book book3 = new Book("Lập trình Go", 50000, 2023, author3);

        book1.print();
        book2.print();
        book3.print();

        System.out.println("So sanh sach 1 vs sach 2 " + book1.compareBook(book2));
        System.out.println("So sanh sach 1 vs sach 3 " + book1.compareBook(book3));

        System.out.println("Sach 1 giam 10%: "+ book1.discount(10));
        System.out.println("Sach 2 giam 20%: "+ book2.discount(20));
        System.out.println("Sach 3 giam 50%: "+ book3.discount(50));

    }
}
