package Jdbc_ex;

import java.sql.*;
import java.util.Scanner;

public class HospitalPatientManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		//Load JDBC Driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/priyanshidb", "root", "MysqlRoot@123");
		
//      System.out.println("Connected Successsfully");
		
		
        String createTableSQL = "CREATE TABLE IF NOT EXISTS patientData (" +
                "id INT PRIMARY KEY AUTO_INCREMENT, " +
                "name VARCHAR(100), " +
                "age INT, " +
                "disease VARCHAR(100), " +
                "admission_date DATE, " +
                "doctor_assigned VARCHAR(100))";

        Statement stmt = con.createStatement();
        stmt.executeUpdate(createTableSQL);

       
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Disease: ");
        String disease = sc.nextLine();

        System.out.print("Enter Admission Date (yyyy-mm-dd): ");
        String admissionDate = sc.nextLine();

        System.out.print("Enter Doctor Assigned: ");
        String doctor = sc.nextLine();

        String insertSQL = "INSERT INTO patientData (name, age, disease, admission_date, doctor_assigned) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement pstmt = con.prepareStatement(insertSQL);
        pstmt.setString(1, name);
        pstmt.setInt(2, age);
        pstmt.setString(3, disease);
        pstmt.setDate(4, Date.valueOf(admissionDate));
        pstmt.setString(5, doctor);

        int rowsInserted = pstmt.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("Patient added successfully!");
        }
        
        
        
        System.out.print("Enter Patient name to update: ");
        String newName = sc.nextLine();
        sc.nextLine();

        System.out.print("New Age: ");
        int newAge = sc.nextInt();
        sc.nextLine();

        System.out.print("New Disease: ");
        String newDisease = sc.nextLine();

        System.out.print("New Admission Date (yyyy-mm-dd): ");
        String newDate = sc.nextLine();

        System.out.print("New Doctor Assigned: ");
        String newDoctor = sc.nextLine();

        String updateSQL = "UPDATE patient SET  age = ?, disease = ?, admission_date = ?, doctor_assigned = ? WHERE name = ?";
        PreparedStatement pstmtUpdate = con.prepareStatement(updateSQL);
        pstmtUpdate.setInt(1, newAge);
        pstmtUpdate.setString(2, newDisease);
        pstmtUpdate.setDate(3, Date.valueOf(newDate));
        pstmtUpdate.setString(4, newDoctor);
        pstmtUpdate.setString(5, newName);

        int updatedRows = pstmtUpdate.executeUpdate();
        if (updatedRows > 0) {
            System.out.println("Patient updated successfully.");
        } else {
            System.out.println("Patient with name " + newName + " not found.");
        }
        
        
        // Delete a patient 
        
        System.out.print("Enter Patient Name to delete: ");
        String deleteName = sc.nextLine();

        String deleteByName = "DELETE FROM patient WHERE name = ?";
        PreparedStatement pstmtDelete = con.prepareStatement(deleteByName);
        pstmtDelete.setString(1, deleteName);

        int deletedRows = pstmtDelete.executeUpdate();
        if (deletedRows > 0) {
            System.out.println("Patient(s) named '" + deleteName + "' deleted successfully.");
        } else {
            System.out.println("No patient found with the name '" + deleteName + "'.");
        }
        

        pstmt.close();
        stmt.close();
        con.close();

		}catch(Exception e) {
			e.printStackTrace();
			}
	}

}
