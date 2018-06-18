package myMaven;

public class FlowerRose {
	
	private Flower flowerProperties;
	private String flowerDesc;
	private String flowerType;
	public FlowerRose() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Flower getFlowerProerties() {
		return flowerProperties;
	}
	
	public void setFlowerProperties(Flower flowerProperties) {
		this.flowerProperties = flowerProperties;
	}
	public String getFlowerDesc() {
		return flowerDesc;
	}
	public void setFlowerDesc(String flowerDesc) {
		this.flowerDesc = flowerDesc;
	}
	
	public String getFlowerType() {
		return flowerType;
	}
	public void setFlowerType(String flowerType) {
		this.flowerType = flowerType;
	}
	@Override
	public String toString() {
		return "FlowerRose [Flower Proerties= Flower Name=" + flowerProperties.getFlowerName() + ", Total no of flowers=" + flowerProperties.getTotalNoOfFlower() + 
				", Flower Color=" + flowerProperties.getFlowerColor() + ", Flower Desc=" + flowerDesc + ", Flower type=" + flowerType + "]";
	}
	
	
	
	
}
