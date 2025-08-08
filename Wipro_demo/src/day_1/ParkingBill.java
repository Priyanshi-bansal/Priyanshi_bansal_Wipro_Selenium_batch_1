package day_1;

public class ParkingBill {
    public static void main(String[] args) {
        String vehicleNumber = "DL04AC1234";
        char vehicleType = 'C'; // C: Car, B: Bike
        byte hoursParked = 5;
        boolean isWeekend = true;
        short parkingSlot = 120;
        int ratePerHour = (vehicleType == 'C') ? 30 : 15;
        float surcharge = isWeekend ? 1.2f : 1.0f;
        double totalBill = hoursParked * ratePerHour * surcharge;

        System.out.println("------ Parking Bill ------");
        System.out.println("Vehicle No     : " + vehicleNumber);
        System.out.println("Type           : " + (vehicleType == 'C' ? "Car" : "Bike"));
        System.out.println("Hours Parked   : " + hoursParked);
        System.out.println("Weekend Surcharge: " + surcharge);
        System.out.println("Total Bill     : ₹" + totalBill);
        System.out.println("Parking slot" + parkingSlot);
    }
}
