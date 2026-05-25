package com.rays.ioc;

public class Car {
	
	private Engine engine;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	
	public void start() {
		
		engine.start();
		System.out.println("end");
	}
	

}
