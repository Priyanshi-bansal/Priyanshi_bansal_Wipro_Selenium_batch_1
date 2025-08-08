package day_1;

public class FlightTicket {
    public static void main(String[] args) {
        String passengerName = "Rahul Verma";
        long ticketNumber = 789456123123L;
        char seatClass = 'E'; // E: Economy, B: Business
        byte noOfPassengers = 2;
        float baseFare = 3999.99f;
        double taxes = baseFare * 0.18;
        short flightNo = 1204;
        boolean isWindowSeat = true;

        double totalAmount = (baseFare + taxes) * noOfPassengers;

        System.out.println("----- Flight Ticket Details -----");
        System.out.println("Passenger     : " + passengerName);
        System.out.println("Ticket No     : " + ticketNumber);
        System.out.println("Flight No     : " + flightNo);
        System.out.println("Seat Class    : " + (seatClass == 'E' ? "Economy" : "Business"));
        System.out.println("Window Seat?  : " + isWindowSeat);
        System.out.println("Passengers    : " + noOfPassengers);
        System.out.println("Base Fare     : ₹" + baseFare);
        System.out.println("Taxes (18%)   : ₹" + taxes);
        System.out.println("Total Amount  : ₹" + totalAmount);
    }
}

