package com.bongani.ioc;

public class CellPhone {
	
	public static void main(String[] args) {
		Sim sim = new Mtn();
		sim.calling();
		sim.data();
	}

}
