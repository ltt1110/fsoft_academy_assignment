package fa.training.entity;

import fa.training.util.Validation;

public class Airplane {
	private String ID;
	private String model;
	private float cruiseSpeed;
	private float emptyWeight;
	private float maxTakeoffWeight;

	public Airplane() {
		super();
	}

	public Airplane(String iD, String model, float cruiseSpeed, float emptyWeight, float maxTakeoffWeight) {
		super();
		ID = iD;
		this.model = model;
		this.cruiseSpeed = cruiseSpeed;
		this.emptyWeight = emptyWeight;
		this.maxTakeoffWeight = maxTakeoffWeight;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public float getCruiseSpeed() {
		return cruiseSpeed;
	}

	public void setCruiseSpeed(float cruiseSpeed) {
		this.cruiseSpeed = cruiseSpeed;
	}

	public float getEmptyWeight() {
		return emptyWeight;
	}

	public void setEmptyWeight(float emptyWeight) {
		this.emptyWeight = emptyWeight;
	}

	public float getMaxTakeoffWeight() {
		return maxTakeoffWeight;
	}

	public void setMaxTakeoffWeight(float maxTakeoffWeight) {
		this.maxTakeoffWeight = maxTakeoffWeight;
	}

	@Override
	public String toString() {
		return "ID=" + ID + ", model=" + model + ", cruiseSpeed=" + cruiseSpeed + ", emptyWeight=" + emptyWeight
				+ ", maxTakeoffWeight=" + maxTakeoffWeight;
	}

	public void input() {
		Validation v = new Validation();
		System.out.println("Enter model: ");
		setModel(v.checkModel());
		System.out.println("Enter cruiseSpeed:");
		setCruiseSpeed(v.checkInputFloat());
		System.out.println("Enter emptyWeight:");
		setEmptyWeight(v.checkInputFloat());
		System.out.println("Enter maxTakeoffWeight:");
		setMaxTakeoffWeight(v.checkInputFloat());

	}

}
