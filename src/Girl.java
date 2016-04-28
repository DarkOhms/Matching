
public class Girl {
	
  String name;
  Boy match;
  
  boolean matched = false;
  
  int rank;
  String[] choices = new String[4];
  int choiceIndex = 0;
  
  Girl(String name){
	  this.name = name;
  }
  
  Girl(String name, String firstChoice){
	  this.name = name;
	  choices[0] = firstChoice;
	  choiceIndex++;
  }
  
  Girl(String name, int rank){
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
  }
  
  public void setMatch(Boy match){
  	
    matched = true;
  	this.match = match;
  	match.setMatch(this);
  	
  }
  
  public Boy getMatch(){
  	return match;
  }
}
