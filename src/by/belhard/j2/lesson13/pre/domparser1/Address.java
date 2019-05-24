package by.belhard.j2.lesson13.pre.domparser1;

public class Address {

	private String city;
	private String street;
	private String house;
	private String apartments;

	public Address(String city, String street, String house, String apartments) {

		this.city = city;
		this.street = street;
		this.house = house;
		this.apartments = apartments;
	}

	@Override
	public String toString() {

		return city + ", " + street + " str., " + house + ", " + apartments;
	}

	public String getCity() {

		return city;
	}

	public void setCity(String city) {

		this.city = city;
	}

	public String getStreet() {

		return street;
	}

	public void setStreet(String street) {

		this.street = street;
	}

	public String getHouse() {

		return house;
	}

	public void setHouse(String house) {

		this.house = house;
	}

	public String getApartments() {

		return apartments;
	}

	public void setApartments(String apartments) {

		this.apartments = apartments;
	}
}
