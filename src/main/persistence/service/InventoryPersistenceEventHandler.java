package main.persistence.service;

import java.util.List;

import main.persistence.domain.VehicleDTO;
import main.persistence.events.InventoryRequestEvent;
import main.persistence.repository.InventoryRepository;

public class InventoryPersistenceEventHandler implements InventoryPersistenceService {

	private InventoryRepository inventoryRepository = null;
	
	public InventoryPersistenceEventHandler(InventoryRepository inventoryRepository) {
		super();
		this.inventoryRepository = inventoryRepository;
	}

	/* (non-Javadoc)
	 * @see main.persistence.service.InventoryPersistenceService#getDealerInventory(main.events.InventoryRequestEvent)
	 */
	@Override
	public List<VehicleDTO> getDealerInventory(InventoryRequestEvent aEvent) {
		return inventoryRepository.find(aEvent.getDealerID());
	}

}
