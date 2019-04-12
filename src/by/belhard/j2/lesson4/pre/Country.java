package by.belhard.j2.lesson4.pre;

public class Country {

	private String title;

	private String zipCode;

	public Country(String title, String zipCode) {

		this.title = title;
		this.zipCode = zipCode;
	}

	public String getTitle() {

		return title;
	}

	public String getZipCode() {

		return zipCode;
	}

	@Override
	public String toString() {

		return "Country{" + "title='" + title + '\'' + ", zipCode='" + zipCode + '\'' + '}';
	}
}
