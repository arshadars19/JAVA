package exercise;

public class WeatherAdviser {
	public String provideWeatherAdvisory(int temperature) {
		if (temperature < 0) {
			return "It is Freezing";
		}
		if (temperature <= 10) {
			return "It is Cold";
		}
		if (temperature <= 20) {
			return "It is cool";
		}
		return "is warm";
	}

}
