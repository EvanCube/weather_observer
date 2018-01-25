package com.hc.ob;

public class Test {

	public static void main(String[] args) {
		
		WeatherSubjectConcrete weatherSubjectConcrete = new WeatherSubjectConcrete();
		
		ObserverImpl observerImplSY = new ObserverImpl();
		observerImplSY.setObserverName("石原里美");
		observerImplSY.setRemindThing("今天上司的目光似乎特别容易盯在你身上，注意上班时间别做私人事情");
		
		ObserverImpl observerImplZW = new ObserverImpl();
		observerImplZW.setObserverName("曾智玮");
		observerImplZW.setRemindThing("只要有一颗纯真美丽的心，总有一天，你会遇到一个女孩，她不要你的房，不要你的车，更不要你的钱，当然了，她也不会要你");
		
		ObserverImpl observerImplZZ = new ObserverImpl();
		observerImplZZ.setObserverName("渣渣辉");
		observerImplZZ.setRemindThing("当你觉得自己又穷又丑时，别灰心，至少你的判断是对的");
		
		weatherSubjectConcrete.attach(observerImplSY);
		weatherSubjectConcrete.attach(observerImplZW);
		weatherSubjectConcrete.attach(observerImplZZ);
		
		weatherSubjectConcrete.setWeatherContent("海南生态软件园，阴天多云，气温13°~26°");
		
	}
	
}
