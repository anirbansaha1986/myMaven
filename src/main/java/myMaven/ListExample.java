package myMaven;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListExample {
	
	private Map<String, String> cc;
	private Set<String> cricketers;
	private List<String> fruits;
	public ListExample() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Map<String, String> getCc() {
		return cc;
	}
	public void setCc(Map<String, String> cc) {
		this.cc = cc;
	}
	public Set<String> getCricketers() {
		return cricketers;
	}
	public void setCricketers(Set<String> cricketers) {
		this.cricketers = cricketers;
	}
	public List<String> getFruits() {
		return fruits;
	}
	public void setFruits(List<String> fruits) {
		this.fruits = fruits;
	}
	
	
	public void printDataItems () {
		System.out.println("All fruit lists are:");
		for (String fruit: fruits) {
			System.out.println(fruit);
		}
		System.out.println("All cricketers are:");
		for (String cricketer: cricketers) {
			System.out.println(cricketer);
		}
		System.out.println("All countries and capitals are:");
		Set<String> keys = cc.keySet();
		for(String ccItem : keys) {
			System.out.println("Country: "+ccItem+"Capitals: "+cc.get(ccItem));
		}
	}
	
	
	

}
