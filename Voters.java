import java.io.*;  
import java.util.Scanner; 

public class Voters {
    private String name;
    private int ID;
    private int passcode;
 
    public Voters(int ID, int passcode) {
       this.passcode = passcode;
       this.ID=ID;    
    }
    
    
  

    public String getName() {
       return name;
    }
 /*/
    public int getVotes() {
       return votes;
    }
 
    public void addVote() {
       votes++;
    }*/
 }
 