package day_1;

public class RailwayTicket {
    public static void main(String[] args) {
        long ticketId = 123456789L;
        String passenger = "Sanjay";
        char seatClass = 'S'; // S: Sleeper, A: AC
        byte passengers = 2;
        float farePerPerson = (seatClass == 'A') ? 1250.75f : 500.50f;
        boolean isSeniorCitizen = false;
        short trainNo = 12618;
        double discount = isSeniorCitizen ? 0.4 : 0.0;
        double totalFare = passengers * farePerPerson * (1 - discount);

        System.out.println("----- Railway Ticket -----");
        System.out.println("Passenger      : " + passenger);
        System.out.println("Ticket ID      : " + ticketId);
        System.out.println("Train No       : " + trainNo);
        System.out.println("Class          : " + (seatClass == 'A' ? "AC" : "Sleeper"));
        System.out.println("No. of Pax     : " + passengers);
        System.out.println("Senior Citizen : " + isSeniorCitizen);
        System.out.println("Fare per Pax   : ₹" + farePerPerson);
        System.out.println("Total Fare     : ₹" + totalFare);
    }
}

