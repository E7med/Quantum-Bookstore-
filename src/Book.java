public abstract class Book {
    private String ISBN;
    private String title;
    private String author;
    private int publishYear;
    private double price;

    public Book(String ISBN, String title, String author, int publishYear, double price) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
        this.price = price;
    }
    public String getISBN() {
        return ISBN;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getPublishYear() {
        return publishYear;
    }
    public double getPrice() {
        return price;
    }

    public abstract boolean isForSale();

    public abstract void handleDelivery(String email, String address, int quantity);
}
