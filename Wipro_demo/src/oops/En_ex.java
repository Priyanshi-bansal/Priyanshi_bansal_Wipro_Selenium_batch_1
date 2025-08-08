package oops;

public class En_ex {
//    public static void main(String[] args) {
//    	Encap_Employee emp = new Encap_Employee();
//
//        emp.setDetails("Priyanshi Bansal", 55000);
//
//        System.out.println("=== Employee Info ===");
//        emp.displayInfo();
//        System.out.println("Salary        : ₹" + emp.getSalary());
//
//        emp.setSalary(60000); 
//        System.out.println("Updated Salary: ₹" + emp.getSalary());
//
//        emp.setSalary(-5000);
//    }
    
    
    
    public static void main(String[] args) {
    	Bank_encap account = new Bank_encap();

        account.setAccount("Priyanshi Bansal", 987654321, 1000.0);

        account.showBalance();

        System.out.print("\nEnter amount to deposit: ");
        double depositAmt = 500;
        account.deposit(depositAmt);
        account.showBalance();

        System.out.print("\nEnter amount to withdraw: ");
        double withdrawAmt = 2000;
        account.withdraw(withdrawAmt);
        account.showBalance();

    }
}
