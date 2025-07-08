public class EBook extends Book {
    private String fileType;

    public EBook(String ISBN, String title, String author, int publishYear, double price, String fileType) {
        super(ISBN, title, author, publishYear, price);
        this.fileType = fileType;
    }

    public String getFileType() {
        return fileType;
    }

    @Override
    public boolean isForSale() {
        return true;
    }

    @Override
    public void handleDelivery(String email, String address, int quantity) {
        System.out.println("Quantum book store: Emailing " + quantity + " eBook(s) to " + email);
    }
}
