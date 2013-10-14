package main.persistence.events;

import java.util.List;

import main.persistence.domain.VehicleDTO;

public class InventoryResponseEvent {

	private List<VehicleDTO> inventory;

	public InventoryResponseEvent(List<VehicleDTO> aInventory) {
		this.inventory = aInventory;
	}

	public long getInventorySize() {
		return this.inventory.size();
	}

}
