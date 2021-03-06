package org.lasencinas.Furnace.main;

import org.lasencinas.Furnace.logica.Regulator;
import org.lasencinas.Furnace.tipos.RoomTemperature;

public class Main {
	public static void main(String[] args) {
		final double minTemp = 15.0;
		final double maxTemp = 21.0;

		RoomTemperature temperature = RoomTemperature.getInstance();

		temperature.setTemperature(17);
		Heater heater = new GasHeater();
		Thermometer thermometer = new RemoteCommandSensor();

		Regulator regulator = new Regulator();

		System.out.println("Arrancando...");
		regulator.regulate(thermometer, heater, minTemp, maxTemp, temperature);
//		temperature = RoomTemperature.getInstance();
//		Jedi yoda = new Jedi();
//		System.out.println("\nArrancando a Yoda: ");
//		regulator.regulate(thermometer, yoda, minTemp, maxTemp, temperature);
//		yoda.speak();
//	}
	}
}
