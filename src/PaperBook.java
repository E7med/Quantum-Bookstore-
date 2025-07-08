public class PaperBook extends Book {
    private int stock;
    private double weight;

    public PaperBook(String ISBN, String title, String author, int publishYear, double price, int stock, double weight) {
        super(ISBN, title, author, publishYear, price);
        this.stock = stock;
        this.weight = weight;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getStock() {
        return stock;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public boolean isForSale() {
        return true;
    }

    @Override
    public void handleDelivery(String email, String address, int quantity) {
        System.out.println("Quantum book store: Shipping " + quantity + " book(s) to " + address);
    }
}
