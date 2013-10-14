package main.persistence.domain;

public class VehicleDTO {
	
	private String model = null;
	private String modelYear = null;
	
	public VehicleDTO(String model, String modelYear) {
		super();
		this.model = model;
		this.modelYear = modelYear;
	}

	public String getModel() {
		return model;
	}

	public String getModelYear() {
		return modelYear;
	}

}
