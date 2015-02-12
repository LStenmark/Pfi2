
public class Cat extends Mammal {
	private int numberOfLifes; 
	
	public Cat (String latinName, int gestationTime, int numberOfLifes) {
		super(latinName,gestationTime);
		this.numberOfLifes = numberOfLifes;
	}
	
	public Cat (String latinName, int gestationTime,int numberOfLifes,String friendlyName) {
		super(latinName,gestationTime);
		this.numberOfLifes = numberOfLifes;
		setFriendlyName(friendlyName);
	}
	
	//Get number of cat lifes
	public int getNunberOfLifes() { 
		return numberOfLifes;
	}
	
	//Set number of cat lifes
	public void setNumberOfLifes(int lives) { 
		numberOfLifes=lives;

	}
	
	public String getInfo(){
		return "The cat " + getFriendlyName() +   " nurses for " + getGetstationtime() +" months and has " + getNunberOfLifes() + " lives. \n";		
	}
}
