package Inheritance;


class Employee {
 String name;
 int id;
 double salary;

 public Employee(String name, int id, double salary) {
     this.name = name;
     this.id = id;
     this.salary = salary;
 }

 public void showDetails() {
     System.out.println("Employee ID   : " + id);
     System.out.println("Name          : " + name);
     System.out.println("Base Salary   : " + salary);
 }
}


class Manager extends Employee {
 String department;

 public Manager(String name, int id, double salary, String department) {
     super(name, id, salary);
     this.department = department;
 }

 public void manageTeam() {
     System.out.println(name + " is managing the " + department + " department.");
 }

 @Override
 public void showDetails() {
     super.showDetails();
     System.out.println("Department    : " + department);
 }
}


class Developer extends Employee {
 String programmingLanguage;

 public Developer(String name, int id, double salary, String language) {
     super(name, id, salary);
     this.programmingLanguage = language;
 }

 public void writeCode() {
     System.out.println(name + " is writing code in " + programmingLanguage);
 }

 @Override
 public void showDetails() {
     super.showDetails();
     System.out.println("Programming   : " + programmingLanguage);
 }
}


public class Company {
 public static void main(String[] args) {
     Manager mgr = new Manager("Priya", 1001, 75000, "HR");
     Developer dev = new Developer("Ravi", 1002, 65000, "Java");

     System.out.println("=== Manager Details ===");
     mgr.showDetails();
     mgr.manageTeam();

     System.out.println("\n=== Developer Details ===");
     dev.showDetails();
     dev.writeCode();
 }
}

