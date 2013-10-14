package main.persistence.service;

import java.util.List;

import main.persistence.domain.VehicleDTO;
import main.persistence.events.InventoryRequestEvent;

public interface InventoryPersistenceService {

	public abstract List<VehicleDTO> getDealerInventory(InventoryRequestEvent aEvent);

}