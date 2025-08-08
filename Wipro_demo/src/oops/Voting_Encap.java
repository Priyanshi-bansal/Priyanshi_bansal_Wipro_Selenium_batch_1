package oops;

public class Voting_Encap {

	    private String name;
	    private int age;
	    private boolean hasVoted = false;

	    public void setVoterDetails(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }


	    public void displayVoterInfo() {
	        System.out.println("Name     : " + name);
	        System.out.println("Age      : " + age);
	        System.out.println("hasVoted :" + hasVoted);
	    }


	    public boolean isEligible() {
	        return age >= 18;
	    }


	    public void Vote(String candidate) {
	        if (!isEligible()) {
	            System.out.println("You are not eligible to vote.");
	        } else if (hasVoted) {
	            System.out.println("You have already voted.");
	        } else {
	            hasVoted = true;
	            System.out.println("Vote done successfully for " + candidate + ".");
	        }
	    }


	    public boolean getVotingStatus() {
	        return hasVoted;
	    }


	    public static void main(String[] args) {
	    	Voting_Encap voter1 = new Voting_Encap();
	        voter1.setVoterDetails("Priyanshi Bansal", 21);

	        System.out.println("=== Voter Details ===");
	        voter1.displayVoterInfo();

	       
	        System.out.println("\n Vote:");
	        voter1.Vote("Candidate A");


	        System.out.println("\nAttempting to Vote Again:");
	        voter1.Vote("Candidate B");

	        System.out.println("\nVoting Status: " + (voter1.getVotingStatus() ? "Already Voted" : "Not Voted"));
	    }
	}

