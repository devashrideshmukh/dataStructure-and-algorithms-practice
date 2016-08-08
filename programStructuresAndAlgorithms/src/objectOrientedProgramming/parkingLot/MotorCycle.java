package objectOrientedProgramming.parkingLot;

public class MotorCycle extends Vehicle {
	public MotorCycle() {
		spotsNeeded = 1;
		size = VehicleSize.Motorcycle;
	}

	public boolean canFitInSpot(ParkingSpot spot) {
		return true;
	}

	public void print() {
		System.out.print("M");
	}
}
