package spring.core;

public class VehicleDetails {

	private int vehicleId;
	private String vehicleName;
	private String vehicleNumber;
	
	public int getVehicleId() {
		return vehicleId;
	}

	@Override
	public String toString() {
		return "VehicleDetails [vehicleId=" + vehicleId + ", vehicleName=" + vehicleName + ", vehicleNumber="
				+ vehicleNumber + "]";
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	
	
	
	
}
