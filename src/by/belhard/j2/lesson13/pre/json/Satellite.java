package by.belhard.j2.lesson13.pre.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonProperty;

public class Satellite {

	private String title;
	private long population;

	@JsonCreator
	public Satellite(@JsonProperty("title") String title, @JsonProperty("population") long population) {

		this.title = title;
		this.population = population;
	}

	@Override
	public String toString() {

		return "\nSatellite [" + title + " : " + population + "]";
	}

	public String getTitle() {

		return title;
	}

	public long getPopulation() {

		return population;
	}

	public void setTitle(String title) {

		this.title = title;
	}

	public void setPopulation(long population) {

		this.population = population;
	}
}
