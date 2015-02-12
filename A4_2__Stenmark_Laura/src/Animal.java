

public abstract class Animal {
	private String latinName; 
	private String friendlyName = "noname" ;

	public Animal (String latinName) {
		this.latinName = latinName;
	}
    //Get info
	public abstract String getInfo();
    
	//Get friendly name
	public String getFriendlyName() {
		return friendlyName;
	}
	
	//Get latin name
	public String getLatinName() {
		return latinName;
	}
    
	//Set friendly name
	public void setFriendlyName(String friendlyName ) {
		this.friendlyName = friendlyName;
	}
}
