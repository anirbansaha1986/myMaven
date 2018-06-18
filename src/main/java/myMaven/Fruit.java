package myMaven;

public class Fruit {
	
	String fruitName = "";

	public Fruit() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Fruit class created");
	}
	

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}


	public String talkAboutYourself() {
		return "Hello I am fruit. My name is= " + fruitName + ", I am used as a food" ;
	}
	
}
