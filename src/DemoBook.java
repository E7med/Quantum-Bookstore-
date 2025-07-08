public class DemoBook extends Book {
    DemoBook(String ISBN, String title, String author, int publishYear) {
        super(ISBN, title, author, publishYear, 0);
    }

    @Override
    public boolean isForSale() {
        return false;
    }

    @Override
    public void handleDelivery(String email, String address, int quantity) {
        System.out.println("Quantum book store: This is a demo book and cannot be sold.");
    }
}