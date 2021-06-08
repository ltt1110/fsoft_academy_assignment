package fa.training.entity;

import fa.training.util.Validation;

public class Helicopter extends Airplane {

	private float range;
	private final String flyMethod = "rotated wing";

	public Helicopter() {
		super();
	}

	public Helicopter(String iD, String model, float cruiseSpeed, float emptyWeight, float maxTakeoffWeight,
			float range) {
		super(iD, model, cruiseSpeed, emptyWeight, maxTakeoffWeight);
		this.range = range;
	}

	@Override
	public void input() {
		Validation v = new Validation();
		System.out.println("Enter id (RW + 5 digits):");
		setID(v.checkID("^[RW].[0-9]{5}$", "Helicopter ID must is correct format"));
		super.input();
		System.out.println("Enter ranger:");
		setRange(v.checkInputFloat());

	}

	public float getRange() {
		return range;
	}

	public void setRange(float range) {
		this.range = range;
	}

	@Override
	public String toString() {
		return "Helicopter [" + super.toString() + " ,range=" + range + ", flyMethod=" + flyMethod + "]";
	}

}
