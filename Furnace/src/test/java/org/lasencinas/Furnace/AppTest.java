package org.lasencinas.Furnace;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.lasencinas.Furnace.tipos.RoomTemperature;


public class AppTest 
{
	@Test
	public void comprobarInstancia() {
		
		RoomTemperature temperature = RoomTemperature.getInstance();
		RoomTemperature temperature1 = RoomTemperature.getInstance();
		assertEquals(temperature,temperature1);
		assertTrue(temperature instanceof RoomTemperature && temperature1 instanceof RoomTemperature);
		
	}


}
