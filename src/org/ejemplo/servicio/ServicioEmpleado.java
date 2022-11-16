package org.ejemplo.servicio;
/*
 * NO BOMO MAYOR A 10K
 * NO SUELDO MAYOR A 5K 
 * 
 */
public class ServicioEmpleado {
	
	public double salarioBono(double salario, double bono) {
		return salario + bono;
	}
	
	public double salarioPrestamo(double salario, double bono) {
		return salario - bono;
	}
}


