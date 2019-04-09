package org.lasencinas.Furnace.main;

import org.lasencinas.Furnace.tipos.RoomTemperature;

public class RemoteCommandSensor implements Thermometer {

	@Override
	public double read(RoomTemperature temperature) {
		
		return temperature.getTemperature();
	}

}
