package fa.training.entity;

import fa.training.util.Validation;

public class Fixedwing extends Airplane {

	private String planeType;
	private float minRunwaySize;
	private final String flyMethod = "fixed wing";

	public Fixedwing() {
		super();
	}

	public Fixedwing(String iD, String model, float cruiseSpeed, float emptyWeight, float maxTakeoffWeight,
			String planeType, float minRunwaySize) {
		super(iD, model, cruiseSpeed, emptyWeight, maxTakeoffWeight);
		this.planeType = planeType;
		this.minRunwaySize = minRunwaySize;
	}

	@Override
	public void input() {
		Validation v = new Validation();

		System.out.println("Enter id (FW + 5 digits):");
		setID(v.checkID("^[FW].[0-9]{5}$", "Fixedwing ID must is correct format"));
		super.input();
		System.out.println("Enter planeType (CAG or LGR or PRV):");
		setPlaneType(v.checkType());

		System.out.println("Enter minRunwaySize:");
		setMinRunwaySize(v.checkInputFloat());

	}

	public String getPlaneType() {
		return planeType;
	}

	public void setPlaneType(String planeType) {
		this.planeType = planeType;
	}

	public float getMinRunwaySize() {
		return minRunwaySize;
	}

	public void setMinRunwaySize(float minRunwaySize) {
		this.minRunwaySize = minRunwaySize;
	}

	@Override
	public String toString() {
		return "Fixedwing [" + super.toString() + " ,planeType=" + planeType + ", minRunwaySize=" + minRunwaySize
				+ ", flyMethod=" + flyMethod + "]";
	}

}
