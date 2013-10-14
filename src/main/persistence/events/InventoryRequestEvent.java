package main.persistence.events;

import java.util.ArrayList;
import java.util.List;

public class InventoryRequestEvent {
	
	private String dealerID = null;
	private List<String> categories = new ArrayList<String>();
	
	public InventoryRequestEvent(String dealerID) {
		super();
		this.dealerID = dealerID;
	}
	
	public InventoryRequestEvent(String dealerID, List<String> categories) {
		this(dealerID);
		this.categories = categories;
	}

	public String getDealerID() {
		return dealerID;
	}

	public List<String> getCategories() {
		return categories;
	}

}
