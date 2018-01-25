package com.hc.ob;

import java.util.ArrayList;
import java.util.List;

public class WeatherSubject {

	private List<Observer> observers = new ArrayList<Observer>();
	
	public void attach(Observer observer){
		observers.add(observer);
	}
	
	public void detach(Observer observer){
		observers.remove(observer);
	}
	
	protected void notifyObservers(){
		for(Observer observer : observers){
			observer.update(this);
		}
	}
	
}
