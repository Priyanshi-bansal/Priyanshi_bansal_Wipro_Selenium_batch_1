package day_1;

public class LibrarySystem {
    public static void main(String[] args) {
        String studentName = "Anjali";
        short rollNo = 5021;
        long bookISBN = 9789389938354L;
        char bookSection = 'A';
        byte issuedBooks = 2;
        boolean isLateReturn = false;
        float finePerDay = 2.5f;
        int lateDays = 4;
        double fine = isLateReturn ? finePerDay * lateDays : 0;

        System.out.println("------ Library Record ------");
        System.out.println("Student       : " + studentName);
        System.out.println("Roll No       : " + rollNo);
        System.out.println("Book ISBN     : " + bookISBN);
        System.out.println("Section       : " + bookSection);
        System.out.println("Books Issued  : " + issuedBooks);
        System.out.println("Late Return?  : " + isLateReturn);
        System.out.println("Fine Amount   : ₹" + fine);
    }
}

