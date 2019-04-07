package org.lasencinas.Furnace.tipos;

public class RoomTemperature {

	private static RoomTemperature instance = null;
	private double temperature = 0d;

	private RoomTemperature() {
	}

	public static synchronized RoomTemperature getInstance() {

		if (instance == null) {
			instance = new RoomTemperature();
		} else {
			System.out.println("No se puede crear un nuevo objeto, ya existe el objeto " + instance.hashCode());
		}

		return instance;
	}

	public double getTemperature() {

		return this.temperature;
	}

	public void setTemperature(double temperature) {

		this.temperature = temperature;

	}

}
