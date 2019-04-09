package org.lasencinas.Furnace.main;

import org.lasencinas.Furnace.tipos.RoomTemperature;

public class GasHeater  implements Heater {
	
	public void engage(RoomTemperature temperature) {
		
		temperature.modifyTemperature(1);
	}

	public void disengage(RoomTemperature temperature) {
		
		temperature.modifyTemperature(-1);
	}

}
