package Hashmap_ex;

import java.util.*;

class PatientEx {
    private String id;
    private String name;
    private String disease;

    public PatientEx(String id, String name, String disease) {
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

public class HospitalHashMapEx {
    public static void main(String[] args) {
        // ✅ Step 1: Add predefined patients
        HashMap<String, PatientEx> patientMap = new HashMap<>();
        patientMap.put("P001", new PatientEx("P001", "Arti", "Fever"));
        patientMap.put("P002", new PatientEx("P002", "Aryan", "Cold"));
        patientMap.put("P003", new PatientEx("P003", "Priyanshi", "Diabetes"));

        // ✅ Step 2: Add new patient
        patientMap.put("P004", new PatientEx("P004", "Ravi", "Cough"));
        System.out.println("Added new patient: " + patientMap.get("P004"));

        // ✅ Step 3: Remove a patient
        patientMap.remove("P002");
        System.out.println("Removed patient with ID P002");

        // ✅ Step 4: Update patient
        PatientEx toUpdate = patientMap.get("P003");
        if (toUpdate != null) {
            toUpdate.setName("Priyanshi Bansal");
            toUpdate.setDisease("Thyroid");
            System.out.println("Updated patient P003: " + toUpdate);
        }

        // ✅ Step 5: Count patients
        System.out.println("Total patients: " + patientMap.size());

        // ✅ Step 6: Get all patients
        System.out.println("All Patients:");
        for (PatientEx p : patientMap.values()) {
            System.out.println(p);
        }

        // ✅ Step 7: Check if a patient exists (by name & disease)
        String searchName = "Arti";
        String searchDisease = "Fever";
        boolean found = false;
        for (PatientEx p : patientMap.values()) {
            if (p.getName().equalsIgnoreCase(searchName) && p.getDisease().equalsIgnoreCase(searchDisease)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Patient with name '" + searchName + "' and disease '" + searchDisease + "' exists.");
        } else {
            System.out.println("Patient not found.");
        }
    }
}

