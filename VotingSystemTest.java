public class VotingSystemTest {
    public static void main(String[] args) {
       VotingSystem votingSystem = new VotingSystem();
       votingSystem.addCandidate("Candidate A");
       votingSystem.addCandidate("Candidate B");
       votingSystem.addCandidate("Candidate C");
 
       votingSystem.castVote();
       votingSystem.castVote();
       votingSystem.castVote();
       votingSystem.castVote();
       votingSystem.castVote();
       votingSystem.castVote();
 
       votingSystem.printResults();
    }
 }
 