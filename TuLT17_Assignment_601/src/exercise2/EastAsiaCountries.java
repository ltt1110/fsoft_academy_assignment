package exercise2;

public class EastAsiaCountries extends Country implements Comparable {
	private String countryTerrain;

	public EastAsiaCountries() {
	}

	public EastAsiaCountries(String countryCode, String countryName, float totalArea, String countryTerrain) {
		super(countryCode, countryName, totalArea);
		this.countryTerrain = countryTerrain;
	}

	public String getCountryTerrain() {
		return countryTerrain;
	}

	public void setCountryTerrain(String countryTerrain) {
		this.countryTerrain = countryTerrain;
	}

	@Override
	public String toString() {
		return super.toString() + "\t\t" + countryTerrain;
	}

	@Override
	public int compareTo(Object t) {
		EastAsiaCountries eac = (EastAsiaCountries) t;
		return this.getCountryName().compareToIgnoreCase(eac.getCountryName());
	}
}
