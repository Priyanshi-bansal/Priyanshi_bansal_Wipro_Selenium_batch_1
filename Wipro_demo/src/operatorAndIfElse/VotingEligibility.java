package operatorAndIfElse;

public class VotingEligibility {
    public static void main(String[] args) {
        int age = 20;
        boolean hasVoterID = true;

        if (age >= 18 && hasVoterID) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }
}

