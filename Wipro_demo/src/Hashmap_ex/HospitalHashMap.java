package Hashmap_ex;

import java.util.*;

class Patient {
    private String id;
    private String name;
    private String disease;

    public Patient(String id, String name, String disease) {
        this.id = id;
        this.name = name;
        this.disease = disease;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDisease() {
        return disease;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Disease: " + disease;
    }
}

public class HospitalHashMap {
    public static void main(String[] args) {	
       
        HashMap<String, Patient> patientMap = new HashMap<>();
        
        patientMap.put("P001", new Patient("P001", "Arti", "Fever"));
        patientMap.put("P002", new Patient("P002", "Aryan", "Cold"));
        patientMap.put("P003", new Patient("P003", "Priyanshi", "Headache"));

     
        patientMap.put("P004", new Patient("P004", "Ravi", "Cough"));
        System.out.println("Added new patient: " + patientMap.get("P004"));

       
        patientMap.remove("P002");
        System.out.println("Removed patient with ID P002");

       
        Patient toUpdate = patientMap.get("P003");
        if (toUpdate != null) {
            toUpdate.setName("Priyanshi Bansal");
            toUpdate.setDisease("Fever");
            System.out.println("Updated patient P003: " + toUpdate);
        }

       
        System.out.println("Total patients: " + patientMap.size());

      
        System.out.println("All Patients:");
        for (Patient p : patientMap.values()) {
            System.out.println(p);
        }

        
        // contains key
        
        System.out.println(patientMap.containsKey("P003"));
        
        // contains value
        boolean found = false;
        found = patientMap.containsValue(new Patient("P003", "Priyanshi", "Headache"));

        if (found) {
            System.out.println("Patient exists.");
        } else {
            System.out.println("Patient not found.");
        }
        
        patientMap.clear();
        System.out.println("After clearing: " + patientMap);
        
        System.out.println("\nIs patient map empty? " + patientMap.isEmpty());

    }
}

