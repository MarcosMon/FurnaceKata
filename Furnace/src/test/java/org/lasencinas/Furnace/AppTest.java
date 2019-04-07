package org.lasencinas.Furnace;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.lasencinas.Furnace.tipos.RoomTemperature;

public class AppTest {
	@Test
	public void comprobarInstancia() {

		RoomTemperature temperature = RoomTemperature.getInstance();
		RoomTemperature temperature1 = RoomTemperature.getInstance();
		assertEquals(temperature, temperature1);
		assertTrue(temperature instanceof RoomTemperature && temperature1 instanceof RoomTemperature);

	}

	@Test
	public void comprobarTemperatura() {
		RoomTemperature temperatura = RoomTemperature.getInstance();
		double temp = 17;
		temperatura.setTemperature(17);
		assertEquals(temperatura.getTemperature(), temp, 0);
	}

}
