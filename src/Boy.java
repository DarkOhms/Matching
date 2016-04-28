
public class Boy {
   
    String name;
    Girl match;
    
    boolean matched = false;
    
    int rank;
    String[] choices = new String[4];
    Girl[] options = new Girl[4];
    
    int choiceIndex = 0;
    int optionsIndex = 0;
    int totalOptions = 0;
    
    boolean option = false;
    int chosen = 0;
    
    
    Boy(String name){
  	  this.name = name;
    }
   
    Boy(String name, String firstChoice){
    	  this.name = name;
    	  choices[0] = firstChoice;
    	  choiceIndex++;
    }
    
    Boy(String name, int rank){
  	  this.name = name;
  	  this.rank = rank;
    }
  
    
    public void setName(String name){
  	  this.name = name;
    }
    
    public String getName(){
  	  return name;
    }
    
    public void setRank(int rank){
  	  this.rank = rank;
    }
    
    public int getRank(){
  	  return rank;
    }
    
    void choice(String choice){
  	  this.choices[choiceIndex] = choice;
  	  choiceIndex++;
    }
    
    void checkForOptions(Girl[] girls){
    	
    	for(int i = 0; i < girls.length; i++){
    		if(girls[i].choices[choiceIndex].equals(name)){
    			//you were chosen
    			option = true;
    			chosen++;
    			//she is now an option
    			options[optionsIndex] = girls[i];
    			optionsIndex++;
    			
    		}
    		totalOptions = optionsIndex;
    	}
    }
    
    public void setMatch(Girl match){
    	
        matched = true;
    	this.match = match;
    	match.setMatch(this);
    }
    
    public Girl getMatch(){
    	return match;
    }
    
    
}
