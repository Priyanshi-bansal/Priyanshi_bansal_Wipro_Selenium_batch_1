package operatorAndIfElse;

public class SalaryIncrement {
    public static void main(String[] args) {
        double salary = 25000;
        int experience = 4;

        if (experience > 3) {
            salary += 3000; // assignment operator
        }

        System.out.println("Updated Salary: ₹" + salary);
    }
}

