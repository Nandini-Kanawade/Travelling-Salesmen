import java.util.ArrayList;
import java.util.Scanner;

public class VotingSystem {
   private ArrayList<Candidate> candidates;

   public VotingSystem() {
      candidates = new ArrayList<Candidate>();
   }

   public void addCandidate(String name) {
      candidates.add(new Candidate(name));
   }

   public void castVote() {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the name of the candidate you wish to vote for:");
      String candidateName = input.nextLine();
      for (Candidate candidate : candidates) {
         if (candidate.getName().equals(candidateName)) {
            candidate.addVote();
            System.out.println("Vote cast for " + candidateName + ".");
            return;
         }
      }
      System.out.println("Candidate not found.");
   }

   public void printResults() {
      System.out.println("Results:");
      for (Candidate candidate : candidates) {
         System.out.println(candidate.getName() + ": " + candidate.getVotes() + " votes.");
      }
   }
}
