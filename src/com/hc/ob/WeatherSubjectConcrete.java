package com.hc.ob;

public class WeatherSubjectConcrete extends WeatherSubject {

	private String weatherContent;

	public String getWeatherContent() {
		return weatherContent;
	}

	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
		this.notifyObservers();
	}
	
}
