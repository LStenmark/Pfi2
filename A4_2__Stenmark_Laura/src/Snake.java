public class Snake extends Animal {

	private boolean poisonus;

	public Snake(String latinName, boolean poisonus) {
		super("Snake");
		this.poisonus = poisonus;
	}

	
	public String isPoisonus() { 
		if (poisonus){
			return "is poisonus";
		} else {
			return " is not poisonus";
		}
	}
	
	
	public String getInfo(){
	  return "The snake named " + getFriendlyName() + " " + isPoisonus() + "\n";
	}

}

