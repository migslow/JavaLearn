package ej05;

public class Ciudad {
	private int ID;
	private String name;
	private String CountryCode;
	private String district;
	private int population;

	public Ciudad() {
		super();
	}

	public Ciudad(int iD, String name, String countryCode, String district, int population) {
		super();
		ID = iD;
		this.name = name;
		CountryCode = countryCode;
		this.district = district;
		this.population = population;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountryCode() {
		return CountryCode;
	}

	public void setCountryCode(String countryCode) {
		CountryCode = countryCode;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "Ciudad [ID=" + ID + ", name=" + name + ", CountryCode=" + CountryCode + ", district=" + district
				+ ", population=" + population + "]";
	}

}
