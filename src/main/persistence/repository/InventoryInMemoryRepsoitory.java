package main.persistence.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.persistence.domain.VehicleDTO;

public class InventoryInMemoryRepsoitory implements InventoryRepository {

	private static Map<String, List<VehicleDTO>> inventoryCache = new HashMap<String, List<VehicleDTO>>();
	
	static {
		
		List<VehicleDTO> dealerInventory = new ArrayList<VehicleDTO>();
		dealerInventory.add(new VehicleDTO("Camaro", "1978"));
		dealerInventory.add(new VehicleDTO("Passat", "2003"));
		inventoryCache.put("56113", dealerInventory);
		
	}
	
	@Override
	public List<VehicleDTO> find(String aDealerCode) {
		return inventoryCache.get(aDealerCode);
	}

}
