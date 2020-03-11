package com.ito.mapers.Mappstruct.dtos;


public class VehicleDTO 
{
	private	int vehicleId;
	private	String vehicleModel;
	private   int fuelCapacity;
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleModel() {
		return vehicleModel;
	}
	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	public int getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public VehicleDTO(int vehicleId, String vehicleModel, int fuelCapacity) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleModel = vehicleModel;
		this.fuelCapacity = fuelCapacity;
	}
	public VehicleDTO() {
		super();
	} 
	
    
}
