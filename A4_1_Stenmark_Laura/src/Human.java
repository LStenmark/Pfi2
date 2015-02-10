
public class Human {
	private String name;
	private Dog dog;
	private boolean owner = false;



	public Human (String name) {
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void buyDog(Dog dog){
		owner = true;
		this.dog = dog;
	}


	public String getInfo(){ 
		if (owner){
			return name + " �ger en hund som heter " + dog.memberName();
		} else {
			return name + " �ger inte en hund";
		}
	}



}
