package day_1;

public class MovieTicket {
    public static void main(String[] args) {
        String movieName = "RRR";
        char seatType = 'P'; // P: Premium, R: Regular
        byte tickets = 4;
        float ticketPrice = (seatType == 'P') ? 250.0f : 150.0f;
        boolean isOnlineBooking = true;
        short bookingId = 3201;
        double convenienceFee = isOnlineBooking ? 20.0 : 0.0;
        long userPhone = 9876543210L;

        double total = tickets * ticketPrice + convenienceFee;

        System.out.println("------ Movie Ticket ------");
        System.out.println("Movie Name      : " + movieName);
        System.out.println("Booking ID      : " + bookingId);
        System.out.println("Phone No        : " + userPhone);
        System.out.println("Seat Type       : " + (seatType == 'P' ? "Premium" : "Regular"));
        System.out.println("Tickets         : " + tickets);
        System.out.println("Price/Ticket    : ₹" + ticketPrice);
        System.out.println("Convenience Fee : ₹" + convenienceFee);
        System.out.println("Total Amount    : ₹" + total);
    }
}

