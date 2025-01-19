package Day1.quanlybophim;

public class Film {
    private String title;
    private int year;
    private Company company;
    private int price;
    private Date releaseDate;

    public Film(String title, int year, Company company, int price, Date releaseDate) {
        this.title = title;
        this.year = year;
        this.company = company;
        this.price = price;
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    // check price
    public boolean cheaperPrice(Film film) {
        return this.price<=film.getPrice();
    }

    public void printNameCompany() {
        System.out.println(this.company.getName());
    }

    public double discount(int x){
        return (double)(this.price-this.price*x/100);
    }


}
