package es.mde.comun;

import java.time.LocalDate;



public class Sueldo {

	private static double CANTIDAD_BONUS = 300;
	private double cantidadMensual;
	private int horasExtras;
	private boolean bonus;
	private LocalDate fechaSueldo;
	private Empleado empleado;
	
	
	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public static double getCANTIDAD_BONUS() {
		return CANTIDAD_BONUS;
	}

	public static void setCANTIDAD_BONUS(double cANTIDAD_BONUS) {
		CANTIDAD_BONUS = cANTIDAD_BONUS;
	}

	public double getCantidadMensual() {
		return cantidadMensual;
	}

	public void setCantidadMensual(double cantidadMensual) {
		this.cantidadMensual = cantidadMensual;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

	public boolean isBonus() {
		return bonus;
	}

	public void setBonus(boolean bonus) {
		this.bonus = bonus;
	}

	public LocalDate getFechaSueldo() {
		return fechaSueldo;
	}

	public void setFechaSueldo(LocalDate fechaSueldo) {
		this.fechaSueldo = fechaSueldo;
	}


	public Sueldo() {
		super();
	}

	public Sueldo(double cantidadMensual, int horasExtras, boolean bonus, LocalDate fechaSueldo, Empleado empleado) {
		super();
		this.cantidadMensual = cantidadMensual;
		this.horasExtras = horasExtras;
		this.bonus = bonus;
		this.fechaSueldo = fechaSueldo;
		this.empleado = empleado;
	}


}
