package com.hc.ob;

public class ObserverImpl implements Observer {

	private String observerName;
	private String weatherContent;
	private String remindThing;

	@Override
	public void update(WeatherSubject weatherSubject) {
		// TODO Auto-generated method stub
		weatherContent = ((WeatherSubjectConcrete) weatherSubject).getWeatherContent();
		System.out.println(observerName + "\n天气状况：" + weatherContent + "\n特别提醒：" + remindThing + "\n");
	}

	public String getObserverName() {
		return observerName;
	}

	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}

	public String getWeatherContent() {
		return weatherContent;
	}

	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
	}

	public String getRemindThing() {
		return remindThing;
	}

	public void setRemindThing(String remindThing) {
		this.remindThing = remindThing;
	}

}
