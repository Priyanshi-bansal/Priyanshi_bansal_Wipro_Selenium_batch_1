package healthcareModule;
import java.util.Scanner;

public class HealthCareSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Patient p1 = new Patient(100, "Priyanshi", 22, "Fever");
		Patient p2 = new Patient(101, "Riya", 23, "Heart Pain");
		
		PatientService service = new PatientServiceImplementation();
		
		service.registerPatient(p1);
		service.registerPatient(p2);
		
		System.out.println("Enter patient ID to see the details: ");
		
		int Id = sc.nextInt();
		
		service.showPatientDetails(Id);
		
		sc.close();
	}

}
