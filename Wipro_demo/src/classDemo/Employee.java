package classDemo;

public class Employee {
    int empId;
    String name;
    String department;
    double salary;

    void setDetails(int id, String empName, String dept, double sal) {
        empId = id;
        name = empName;
        department = dept;
        salary = sal;
    }

    void displayDetails() {
        System.out.println("Employee ID     : " + empId);
        System.out.println("Name            : " + name);
        System.out.println("Department      : " + department);
        System.out.println("Salary          : ₹" + salary);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        emp1.setDetails(101, "Priyanshi Bansal", "IT", 50000);
        emp2.setDetails(102, "Rahul Verma", "HR", 45000);

        System.out.println("=== Employee Details ===");
        emp1.displayDetails();
        emp2.displayDetails();
    }
}

