package by.belhard.j2.lesson13.pre.json;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

public class City {

	private String title;
	private long population;
	private List<String> districts;
	private List<Satellite> satellites;

	@JsonCreator
	public City(@JsonProperty("title") String title, @JsonProperty("population") long population, @JsonProperty("districts") List<String> districts,
				@JsonProperty("satellites") List<Satellite> satellites) {

		this.title = title;
		this.population = population;
		this.districts = districts;
		this.satellites = satellites;
	}

	@Override
	public String toString() {

		return "City [" + title + " : " + population + "]\nDistricts:\n" + districts + "\nSatellites:\n" + satellites;
	}
}
