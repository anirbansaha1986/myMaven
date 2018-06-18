package myMaven;

public class Flower {

	private String flowerName;
	private int totalNoOfFlower;
	private String flowerColor;
	
	public Flower() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Flower(String flowerName) {
		super();
		this.flowerName = flowerName;
		System.out.println("Constructor 1 called");
	}

	public Flower(int totalNoOfFlower) {
		super();
		this.totalNoOfFlower = totalNoOfFlower;
		System.out.println("Constructor 2 called");
	}

	public Flower(String flowerName, String flowerColor) {
		super();
		this.flowerName = flowerName;
		this.flowerColor = flowerColor;
		System.out.println("Constructor 3 called");
	}

	public Flower(String flowerName, int totalNoOfFlower) {
		super();
		this.flowerName = flowerName;
		this.totalNoOfFlower = totalNoOfFlower;
		System.out.println("Constructor 4 called");
	}

	public Flower(String flowerName, int totalNoOfFlower, String flowerColor) {
		super();
		this.flowerName = flowerName;
		this.totalNoOfFlower = totalNoOfFlower;
		this.flowerColor = flowerColor;
		System.out.println("Constructor 5 called");
	}

	public String getFlowerName() {
		return flowerName;
	}

	public void setFlowerName(String flowerName) {
		this.flowerName = flowerName;
	}

	public int getTotalNoOfFlower() {
		return totalNoOfFlower;
	}

	public void setTotalNoOfFlower(int totalNoOfFlower) {
		this.totalNoOfFlower = totalNoOfFlower;
	}

	public String getFlowerColor() {
		return flowerColor;
	}

	public void setFlowerColor(String flowerColor) {
		this.flowerColor = flowerColor;
	}

	@Override
	public String toString() {
		return "Flower [flowerName=" + flowerName + ", totalNoOfFlower=" + totalNoOfFlower + ", flowerColor="
				+ flowerColor + "]";
	}
	
	
	
}
