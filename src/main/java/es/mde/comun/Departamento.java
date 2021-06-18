package es.mde.comun;

import java.util.Collection;

public class Departamento {

	private String nombreDepartamento;

	protected Collection<Empleado> empleados;

	public Collection<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(Collection<Empleado> empleados) {
		this.empleados = empleados;
	}

	public Departamento() {
		super();
	}

	public String getNombreDepartamento() {
		return nombreDepartamento;
	}

	public void setNombreDepartamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}

	public Departamento(String nombreDepartamento, Collection<Empleado> empleados) {
		super();
		this.nombreDepartamento = nombreDepartamento;
		this.empleados = empleados;
	}

}
