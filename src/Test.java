public class Test {
    public static void main(String[] args) {
        Inventory store = new Inventory();

        PaperBook atomicHabits = new PaperBook("ISBN004", "Atomic Habits", "James Clear", 2018, 200.0, 10, 0.7);
        EBook powerOfNow = new EBook("ISBN005", "The Power of Now", "Eckhart Tolle", 1997, 80.0, "EPUB");
        DemoBook thinkRichDemo = new DemoBook("ISBN006", "Think and Grow Rich", "Napoleon Hill", 1937);

        store.addBook(atomicHabits);
        store.addBook(powerOfNow);
        store.addBook(thinkRichDemo);

        System.out.println("------------------------------------------------");

        store.buyBook("ISBN004", 1, "Eslam.ahmed90@gmail.com", "Alex,Alexandria");  // Atomic Habits

        store.buyBook("ISBN005", 1, "khaled.mostafa21@gmail.com", "");

        store.buyBook("ISBN006", 1, "laila.hassan88@gmail.com", "");

        System.out.println("------------------------------------------------");

        store.removeOldBook(10, 2025);
    }
}
