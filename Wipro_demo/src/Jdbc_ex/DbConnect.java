package Jdbc_ex;
import java.sql.*;

public class DbConnect {

	public static void main(String[] args) {
		try {
			//Load JDBC Driver
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Establish connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/priyanshidb", "root", "MysqlRoot@123");
			
//          System.out.println("Connected Successfully");
			
//			Statement stmt=con.createStatement();
//			
//			String sql="CREATE TABLE IF NOT EXISTS student("+"id INT PRIMARY KEY AUTO_INCREMENT,"
//					+ "name VARCHAR(100),"+"age INT,"+"course VARCHAR(100))";
//			
//			stmt.executeUpdate(sql);
//			System.out.println("Table 'student' created successfully.");
//			con.close();
			
//			Statement stmt=con.createStatement();
//			
//			String sql="CREATE TABLE IF NOT EXISTS patient("+"id INT PRIMARY KEY AUTO_INCREMENT,"
//					+ "name VARCHAR(100),"+"age INT,"+"disease VARCHAR(100))";
//			
//			stmt.executeUpdate(sql);
//			System.out.println("Table 'patient' created successfully.");
			
//			String sql="INSERT INTO patient(name, age, disease) VALUES(?, ?, ?)";
//			
//			PreparedStatement pstmt=con.prepareStatement(sql);
//			
//			pstmt.setString(1, "Renu");
//			pstmt.setInt(2, 30);
//			pstmt.setString(3, "cold");
//			
//			int rowsInserted=pstmt.executeUpdate();
//			if(rowsInserted>0)
//			{
//				System.out.println("Patient inserted successfully");
//			}
			
//			String sql="INSERT INTO patient(name, age, disease) VALUES(?, ?, ?)";
//			
//			PreparedStatement pstmt=con.prepareStatement(sql);
//			String[][] data=
//			{
//					{"Anshita", "22", "Fever"},
//					{"Sri Laxmi", "23", "Cold"},
//					{"Ashwarya", "22", "headche"},
//					{"Manjeera", "22", "Pain"}
//			};
//				for(String[] row : data)
//			{
//				pstmt.setString(1, row[0]);
//				pstmt.setInt(2, Integer.parseInt(row[1]));
//				pstmt.setString(3, row[2]);
//				pstmt.executeUpdate();
//			}
//			System.out.println(" All patients inserted successfully");
//			
			
			//update query
			
//			String updateSql = "UPDATE patient SET disease = ? WHERE name = ?";
//			PreparedStatement pstmtUpdate = con.prepareStatement(updateSql);
//			pstmtUpdate.setString(1, "Flu");
//			pstmtUpdate.setString(2, "Sri Laxmi");
//			int rowsUpdated = pstmtUpdate.executeUpdate();
//
//			if (rowsUpdated > 0) {
//			    System.out.println("Patient record updated successfully.");
//			} else {
//			    System.out.println("No matching patient found to update.");
//			}
			
			String updateSql = "UPDATE patient SET age = ?, disease = ? WHERE id = ?";
			PreparedStatement pstmt = con.prepareStatement(updateSql);

			
			pstmt.setInt(1, 24);
			pstmt.setString(2, "Viral Fever");
			pstmt.setInt(3, 1);
			int r1 = pstmt.executeUpdate(); 

			
			pstmt.setInt(1, 25);
			pstmt.setString(2, "Migraine");
			pstmt.setInt(3, 3);
			int r2 = pstmt.executeUpdate(); 

			System.out.println("Rows updated: " + (r1 + r2));

			pstmt.close();

			
			con.close();
			

		}
			catch (Exception e)
		{
				e.printStackTrace();
				
			}
		


	}

}

;

	