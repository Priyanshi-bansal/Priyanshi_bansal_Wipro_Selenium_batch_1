package operatorAndIfElse;

public class BMICalculator {
    public static void main(String[] args) {
        float weight = 65.0f; // in kg
        float height = 1.7f;  // in meters

        float bmi = weight / (height * height);

        System.out.println("BMI: " + bmi);

        if (bmi < 18.5) System.out.println("Underweight");
        else if (bmi < 25) System.out.println("Normal");
        else System.out.println("Overweight");
    }
}

