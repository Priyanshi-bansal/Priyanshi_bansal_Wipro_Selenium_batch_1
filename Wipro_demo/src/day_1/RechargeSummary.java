package day_1;

public class RechargeSummary {
    public static void main(String[] args) {
        long mobile = 9876543210L;
        char planType = 'D'; // D: Data, V: Voice, C: Combo
        byte validityDays = 28;
        float planCost = 199.99f;
        boolean isAutoRenewal = false;
        short rechargeID = 14321;
        double gst = planCost * 0.18;
        int customerID = 100001;

        double totalPayable = planCost + gst;

        System.out.println("------ Mobile Recharge ------");
        System.out.println("Customer ID    : " + customerID);
        System.out.println("Mobile No      : " + mobile);
        System.out.println("Recharge ID    : " + rechargeID);
        System.out.println("Plan Type      : " + (planType == 'D' ? "Data" : planType == 'V' ? "Voice" : "Combo"));
        System.out.println("Validity       : " + validityDays + " days");
        System.out.println("Base Cost      : ₹" + planCost);
        System.out.println("GST (18%)      : ₹" + gst);
        System.out.println("Auto Renewal?  : " + isAutoRenewal);
        System.out.println("Total Payable  : ₹" + totalPayable);
    }
}

