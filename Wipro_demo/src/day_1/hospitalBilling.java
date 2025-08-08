package day_1;

public class hospitalBilling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String patientName = "Priya";
	        byte age = 29;
	        char gender = 'F';
	        short patientID = 32767;
	        int roomNo = 203;
	        long contactNumber = 9876543210L;
	        float medicineCost = 1500.50f;
	        double treatmentCost = 12345.75;
	        boolean hasInsurance = true;

	        double totalCost = medicineCost + treatmentCost;
	        double discount = hasInsurance ? totalCost * 0.2 : 0.0;
	        double finalBill = totalCost - discount;

	        System.out.println("----- Patient Billing Summary -----");
	        System.out.println("Name         : " + patientName);
	        System.out.println("Patient ID   : " + patientID);
	        System.out.println("Age/Gender   : " + age + " / " + gender);
	        System.out.println("Room No      : " + roomNo);
	        System.out.println("Phone        : " + contactNumber);
	        System.out.println("Medicine     : ₹" + medicineCost);
	        System.out.println("Treatment    : ₹" + treatmentCost);
	        System.out.println("Insurance?   : " + (hasInsurance ? "Yes" : "No"));
	        System.out.println("Discount     : ₹" + discount);
	        System.out.println("Final Bill   : ₹" + finalBill);
	}

}
