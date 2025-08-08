package classDemo;

public class Book {
    String title;
    String author;
    String publisher;
    double price;

    void setDetails(String t, String a, String p, double pr) {
        title = t;
        author = a;
        publisher = p;
        price = pr;
    }

    void displayDetails() {
        System.out.println("Title     : " + title);
        System.out.println("Author    : " + author);
        System.out.println("Publisher : " + publisher);
        System.out.println("Price     : ₹" + price);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
    	
        Book book1 = new Book();
        Book book2 = new Book();

        book1.setDetails("Java Programming", "Herbert Schildt", "McGraw Hill", 650.0);
        book2.setDetails("Clean Code", "Robert C. Martin", "Pearson", 850.0);

        System.out.println("=== Book Details ===");
        book1.displayDetails();
        book2.displayDetails();
    }
}

