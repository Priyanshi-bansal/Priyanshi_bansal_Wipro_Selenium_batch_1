package oops;

public class patient_encap {

	   
	    private String name;
	    private int age;
	    private String gender;
	    private String medicalHistory;

	    public void setGeneralInfo(String name, int age, String gender) {
	        this.name = name;
	        this.age = age;
	        this.gender = gender;
	    }


	    public void displayGeneralInfo() {
	        System.out.println("Patient Name : " + name);
	        System.out.println("Age          : " + age);
	        System.out.println("Gender       : " + gender);
	    }




	    public void setMedicalHistory(String history) {
	        this.medicalHistory = history;
	    }

	    public String getMedicalHistory() {
	        return medicalHistory;
	    }


	    public void displayFullRecord(boolean isDoctor) {
	        displayGeneralInfo();
	        if (isDoctor) {
	            System.out.println("Medical History: " + medicalHistory);
	        } else {
	            System.out.println("Medical History: [PROTECTED]");
	        }
	    }


	    public static void main(String[] args) {
	    	patient_encap patient = new patient_encap();


	        patient.setGeneralInfo("Priyanshi Bansal", 25, "Female");

	        patient.setMedicalHistory("Flu & Fever");


	        System.out.println("=== Access as Receptionist ===");
	        patient.displayFullRecord(false);


	        System.out.println("\n=== Access as Doctor ===");
	        patient.displayFullRecord(true);
	    }
	}

