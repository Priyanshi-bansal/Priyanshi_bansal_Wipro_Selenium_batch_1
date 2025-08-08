package healthcareModule;
import java.util.Map;
import java.util.HashMap;

public class PatientServiceImplementation implements PatientService{
 public Map<Integer,Patient> patients = new HashMap<>();
 
 @Override
 public void registerPatient(Patient patient) {
	 patients.put(patient.getId(), patient);
	 System.out.println("Patient registered successfully");
 }
 
 @Override
 public void showPatientDetails(int patientId) {
	 Patient p = patients.get(patientId);
	 if(p != null) {
		 System.out.println("ID: " + p.getId());
		 System.out.println("Name: " + p.getName());
		 System.out.println("Age: " + p.getAge());
		 System.out.println("Illness: " + p.getIllness());
	 }
 }
 
   

}
