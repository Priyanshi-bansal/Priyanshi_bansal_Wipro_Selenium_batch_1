package operatorAndIfElse;

public class GradeCalculator {
    public static void main(String[] args) {
        int marks = 84;
        char grade;

        switch (marks / 10) {
            case 10: case 9: grade = 'A'; break;
            case 8: grade = 'B'; break;
            case 7: grade = 'C'; break;
            case 6: grade = 'D'; break;
            default: grade = 'F';
        }

        System.out.println("Grade: " + grade);
    }
}

