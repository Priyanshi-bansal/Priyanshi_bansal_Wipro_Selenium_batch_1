package wrapperClass;

import java.util.ArrayList;

class Student {
    String name;
    Integer mathMarks;
    Integer scienceMarks;
    Integer englishMarks;
    Boolean isPassed;

    public Student(String name, Integer math, Integer science, Integer english) {
        this.name = name;
        this.mathMarks = math;
        this.scienceMarks = science;
        this.englishMarks = english;
        this.isPassed = checkPassStatus();
    }

    private Boolean checkPassStatus() {
        return (mathMarks >= 33 && scienceMarks >= 33 && englishMarks >= 33);
    }

    public int getTotalMarks() {
        return mathMarks + scienceMarks + englishMarks; 
    }

    public void displayResult() {
        System.out.println("Name: " + name);
        System.out.println("Math: " + mathMarks);
        System.out.println("Science: " + scienceMarks);
        System.out.println("English: " + englishMarks);
        System.out.println("Total: " + getTotalMarks());
        System.out.println("Pass: " + isPassed);
        
    }
}

public class StudentMarksManagement {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        
        System.out.println("Create a student");
        
        Student s1 = new Student("Priyanshi", 85, 90, 88);
        students.add(s1);
        
        Student s2 = new Student("Ravi", 45, 22, 67);
        students.add(s2);
        
        
        Student s3 = new Student("Sneha", 55, 33, 40);
        students.add(s3);
       

        for (Student s : students) {
            s.displayResult();
        }
    }
}
