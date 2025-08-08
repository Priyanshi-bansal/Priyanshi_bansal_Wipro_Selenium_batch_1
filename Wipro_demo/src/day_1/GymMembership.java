package day_1;

public class GymMembership {
    public static void main(String[] args) {
        String memberName = "Kiran";
        byte age = 23;
        char gender = 'M';
        short membershipId = 2024;
        boolean isPremium = true;
        int durationMonths = 6;
        float monthlyFee = 799.99f;
        double discount = isPremium ? 0.15 : 0.0;
        long contact = 9988776655L;

        double total = monthlyFee * durationMonths;
        double discountAmt = total * discount;
        double finalAmount = total - discountAmt;

        System.out.println("---- Gym Membership Bill ----");
        System.out.println("Member Name   : " + memberName);
        System.out.println("Membership ID : " + membershipId);
        System.out.println("Age/Gender    : " + age + " / " + gender);
        System.out.println("Contact       : " + contact);
        System.out.println("Premium Member: " + isPremium);
        System.out.println("Duration      : " + durationMonths + " months");
        System.out.println("Total (No disc): ₹" + total);
        System.out.println("Discount       : ₹" + discountAmt);
        System.out.println("Final Amount   : ₹" + finalAmount);
    }
}

