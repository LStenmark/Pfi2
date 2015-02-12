
public class Dog extends Mammal {
	private boolean stupid; 
	
	public Dog (String latinName, int gestationTime, boolean stupid) {
		super(latinName,gestationTime);
		this.stupid = stupid;
	}
	
	public Dog (String latinName, int gestationTime, boolean stupid,String friendlyName) {
		super(latinName,gestationTime);
		this.stupid = stupid;
		setFriendlyName(friendlyName);
	}
	
	//Return stupid if dog is stupid, else return not stupid
	public String isStupid() { 
		if (stupid){
			return "stupid";
		} else {
			return " not stupid";
		}
	}
	
	public String getInfo(){
		 return "The dog named " + getFriendlyName() +   " nurses for " + getGetstationtime() +" months and is " + isStupid() + "\n";
	}
}
