package org.lasencinas.Furnace.main;

import org.lasencinas.Furnace.tipos.RoomTemperature;

public interface Heater {

	void engage(RoomTemperature temperature);

	void disengage(RoomTemperature temperature);

}
