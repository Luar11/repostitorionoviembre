package org.ejemplo.servicio;


import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class TestServicio extends TestCase{
	
	ServicioEmpleado servicioEmpleado=null;
	
	@Test
	void test() {
		servicioEmpleado = new ServicioEmpleado();
	}
	
	@Test
	public void tesSalarioBono() {
		test();
		assertTrue(servicioEmpleado.salarioBono(10000.0, 5000.0)==15000.0);
	}
	
	@Test
	public void tesSalarioPrestamo() {
		test();
		assertEquals(servicioEmpleado.salarioPrestamo(10000.0, 5000.0), 5000.0);
	}

}
