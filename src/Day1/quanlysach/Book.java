package Day1.quanlysach;

public class Book {
    private String name;
    private Author author;
    private int year;
    private int price;
    public Book(String name,int price,int year,Author author) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", price='" + price + '\'' +
                '}';
    }
    public void print() {
        System.out.println(this.name);
    }
    public boolean compareBook(Book book) {
        return this.year==book.getYear();
    }

    public double discount(int x) {
        return (double) (this.price-this.price*x/100);
    }
}
