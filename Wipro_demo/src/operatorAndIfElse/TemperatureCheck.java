package operatorAndIfElse;

public class TemperatureCheck {
    public static void main(String[] args) {
        float temp = 37.5f;

        if (temp >= 36.5 && temp <= 37.5) {
            System.out.println("Normal Temperature");
        } else if (temp > 37.5) {
            System.out.println("Fever Detected");
        } else {
            System.out.println("Low Temperature");
        }
    }
}

