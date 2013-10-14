package main.persistence.repository;

import java.util.List;

import main.persistence.domain.VehicleDTO;

public interface InventoryRepository {
	public abstract List<VehicleDTO> find(String aDealerCode);
}
