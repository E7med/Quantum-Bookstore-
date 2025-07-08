import java.util.ArrayList;

public class Inventory {
    ArrayList<Book> inventory = new ArrayList<>();

    public void addBook(Book book) {
        inventory.add(book);
        System.out.println("Quantum book store: Added book '" + book.getTitle() + "' (ISBN: " + book.getISBN() + ")");
    }

    public Book removeOldBook(int maxAge, int currentYear) {
        for (int i = 0; i < inventory.size(); i++) {
            Book b = inventory.get(i);
            if (currentYear - b.getPublishYear() > maxAge) {
                inventory.remove(i);
                System.out.println("Quantum book store: Removed outdated book '" + b.getTitle() + "'");
                return b;
            }
        }
        return null;
    }

    public double buyBook(String isbn, int quantity, String email, String address) {
        for (Book b : inventory) {
            if (b.getISBN().equals(isbn)) {

                if (!b.isForSale()) {
                    System.out.println("Quantum book store: Book '" + b.getTitle() + "' is not for sale.");
                    return 0;
                }

                if (b instanceof PaperBook) {
                    PaperBook pb = (PaperBook) b;
                    if (pb.getStock() < quantity) {
                        System.out.println("Quantum book store: Not enough stock for '" + pb.getTitle() + "'. Requested: " + quantity + ", Available: " + pb.getStock());
                        return 0;
                    }
                    pb.setStock(pb.getStock() - quantity);
                    System.out.println("Quantum book store: Shipping " + quantity + " of paper book '" + pb.getTitle() + "' to address: " + address);
                }

                else if (b instanceof EBook) {
                    if (quantity > 1) {
                        System.out.println("Quantum book store: Only one EBook can be bought at a time.");
                        return 0;
                    }
                    System.out.println("Quantum book store: Sending EBook '" + b.getTitle() + "' to email: " + email);
                }

                double total = b.getPrice() * quantity;
                System.out.println("Quantum book store: Bought " + quantity + " of '" + b.getTitle() + "' for $" + total);
                return total;
            }
        }

        System.out.println("Quantum book store: Book with ISBN '" + isbn + "' not found.");
        return 0;
    }
}
