package healthcareModule;

public class Patient {
  private int Id;
  private String Name;
  private int age;
  private String illness;
  
  Patient(int Id, String Name, int age, String illness){
	  this.Id = Id;
	  this.Name = Name;
	  this.age = age;
	  this.illness = illness;
  }
  
  public int getId() {return Id;}
  public String getName() {return Name;}
  public int getAge() {return age;}
  public String getIllness() {return illness;}
  
  public void setIllness(String illness) {
	  this.illness = illness;
  }
}
