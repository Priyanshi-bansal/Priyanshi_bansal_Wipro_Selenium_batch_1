package operatorAndIfElse;

public class TrafficLight {
    public static void main(String[] args) {
        String signal = "red";

        switch (signal) {
            case "green":
                System.out.println("Go");
                break;
            case "yellow":
                System.out.println("Slow down");
                break;
            case "red":
                System.out.println("Stop");
                break;
            default:
                System.out.println("Invalid Signal");
        }
    }
}

