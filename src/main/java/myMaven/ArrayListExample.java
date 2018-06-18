package myMaven;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Vector;

public class ArrayListExample {

	Vector<String> arrayList;
	LinkedHashMap<String, String> linkedHashMap;
	LinkedHashSet<String> linkedHashSet;
	
	public ArrayListExample() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vector<String> getArrayList() {
		return arrayList;
	}
	public void setArrayList(Vector<String> arrayList) {
		this.arrayList = arrayList;
	}
	public LinkedHashMap<String, String> getLinkedHashMap() {
		return linkedHashMap;
	}
	public void setLinkedHashMap(LinkedHashMap<String, String> linkedHashMap) {
		this.linkedHashMap = linkedHashMap;
	}
	public LinkedHashSet<String> getLinkedHashSet() {
		return linkedHashSet;
	}
	public void setLinkedHashSet(LinkedHashSet<String> linkedHashSet) {
		this.linkedHashSet = linkedHashSet;
	}
	
	public void printDataItems () {
		System.out.println("All fruit lists are:");
		for (String listItem: arrayList) {
			System.out.println(listItem);
		}
		System.out.println("All cricketers are:");
		for (String hashSetItem: linkedHashSet) {
			System.out.println(hashSetItem);
		}
		System.out.println("All countries and capitals are:");
		Set<String> keys = linkedHashMap.keySet();
		for(String ccItem : keys) {
			System.out.println("Country: "+ccItem+"Capitals: "+linkedHashMap.get(ccItem));
		}
	}
	
	
}
