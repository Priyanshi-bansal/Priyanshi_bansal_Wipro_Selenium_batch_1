package oops;

public class Encap_Employee {

	    private String name;
	    private double salary;

	    public void setDetails(String name, double salary) {
	        this.name = name;
	        this.salary = salary;
	    }

	    public void setSalary(double salary) {
	        if (salary > 0) {
	            this.salary = salary;
	        } else {
	            System.out.println("Invalid salary. Must be positive.");
	        }
	    }


	    public double getSalary() {
	        return salary;
	    }

	    // Display other details
	    public void displayInfo() {
	        System.out.println("Name          : " + name);
	    }

	   
	}

