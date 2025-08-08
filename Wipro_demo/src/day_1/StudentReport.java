package day_1;

public class StudentReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String studentName = "Anuj";
	        byte semester = 4;
	        short rollNumber = 1024;
	        int totalMarks = 455;
	        float gpa = 8.75f;
	        double cgpa = 8.43;
	        char grade = 'A';
	        boolean isScholarshipEligible = gpa >= 8.5;

	        System.out.println("------ Student Report Card ------");
	        System.out.println("Name           : " + studentName);
	        System.out.println("Roll No        : " + rollNumber);
	        System.out.println("Semester       : " + semester);
	        System.out.println("Total Marks    : " + totalMarks + "/500");
	        System.out.println("GPA            : " + gpa);
	        System.out.println("CGPA           : " + cgpa);
	        System.out.println("Grade          : " + grade);
	        System.out.println("Scholarship    : " + (isScholarshipEligible ? "Yes" : "No"));
	}

}
