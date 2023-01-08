package com.upskill.java_5;

public class AbstarctClassImplementation extends AbstractClass{

	@Override
	public void iDoor() {
		System.out.println("My car has 2 door ");
		
	}

	@Override
	public String iEngine() {
		System.out.println("My car has 5 Wheel 1");
		return "5 hp";
	}

	@Override
	public int iWheel() {
		System.out.println("My car has  4 ");
		return 0;
	}
	
	

}
