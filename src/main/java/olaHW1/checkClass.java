package olaHW1;

import java.util.Vector;

public class checkClass {

	
    Vector<item> items = new Vector<item>();

	int cou=0;
	private int totalprice=0;
	
	public void Addnewitem(Integer int1, int price, String name) {
		// TODO Auto-generated method stub
		item i = new item(int1, price, name);
		items.add(i);
		cou++;
		
	}
	
	
	public void countItems(String name, int count) {
		for(int j=0; j<cou ; j++) {
		if(items.get(j).name.equals(name)) {
			 items.get(j).count += count;
		}
		}
		
	}

	public int total() {
		// TODO Auto-generated method stub
		
		for(item i: items) {
			totalprice += (i.price* i.count);
		
		}
		return totalprice;
	}

}

class item{
	
	int count;
	int price;
	String name;
	public item(int count, int price, String name){
		this.price = price;
		this.count = count;
		this.name = name;
		
	}
	
	}
