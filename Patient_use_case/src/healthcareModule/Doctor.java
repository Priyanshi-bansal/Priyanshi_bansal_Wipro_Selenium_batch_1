package healthcareModule;

public abstract class Doctor {
String name;
String specialization;

public Doctor(String name, String specialization) {
	this.name = name;
	this.specialization = specialization;
}

public abstract void diagnose(Patient patient);

}

  class GeneralPhysician extends Doctor {
	public GeneralPhysician(String name) {
		super(name, "General Physician");
	}
	
	public void diagnose(Patient patient) {
		System.out.println("Dr. "+ name + " diagonses "+ patient.getName() + " with illness " + patient.getIllness());
		
	}
}
  
  class Cardiologist extends Doctor {
		public Cardiologist(String name) {
			super(name, "cardiologist");
		}
		
		public void diagnose(Patient patient) {
			System.out.println("Dr. "+ name + " diagonses "+ patient.getName() + " for heart related illness " + patient.getIllness());
			
		}
	}
 
 
