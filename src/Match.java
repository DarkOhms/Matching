import java.util.*;

public class Match {
	
	static int round = 0;
	
	public void matchRound(Boy[] sellers){
		
		Boy contender;
		int contenderScore = 0;
		
		//check for who is the chooser with the most options
		for(int i = 0; i < sellers.length; i++){
			if(sellers[i].optionsIndex > contenderScore)
				contender = sellers[i];
		}
		
		//the person with the options then chooses from the options
		for(int i = 0; i < sellers.length; i++){
			if(sellers[i].equals(contender))
				sellers[i].setMatch(sellers[i].options[round]);
		}
		round++;
	}
  public static void main(String[] args){
	  
	  Boy[] boys = new Boy[4];
	  Girl[] girls = new Girl[4];
	  
	  //round 1 guys
	  boys[0].setName("Studly");
	  boys[0].choice("Princess");
	  
	  boys[1].setName("Beta");
	  boys[1].choice("Princess"); 
	  
	  boys[2].setName("LoverBoy");
	  boys[2].choice("Princess"); 
	  
	  boys[3].setName("NerdStatus");
	  boys[3].choice("Princess"); 
	  
	  //round 1 girls
	  girls[0].setName("Princess");
	  girls[0].choice("Studly");
	  
	  girls[1].setName("Slut");
	  girls[1].choice("Studly");
	  
	  girls[2].setName("Prude");
	  girls[2].choice("Studly");
	  
	  girls[3].setName("Homely");
	  girls[3].choice("Studly");
	  
	  //check for match and eliminate choices
	  for(int i = 0; i < boys.length; i++)
	     boys[i].checkForOptions(girls);
  }
  
}
