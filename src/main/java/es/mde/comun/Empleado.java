package es.mde.comun;

import java.util.Collection;

public class Empleado {

	private String nombre;
	private String apellidos;
	private String dni;
	private String tipoEmpleado;
	private Collection<Sueldo> sueldos;
	private Departamento departamento;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTipoEmpleado() {
		return tipoEmpleado;
	}

	public void setTipoEmpleado(String tipoEmpleado) {
		this.tipoEmpleado = tipoEmpleado;
	}

	public Collection<Sueldo> getSueldos() {
		return sueldos;
	}

	public void setSueldos(Collection<Sueldo> sueldos) {
		this.sueldos = sueldos;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Empleado() {
		super();
	}

	public Empleado(String nombre, String apellidos, String dni, String tipoEmpleado, Collection<Sueldo> sueldos,
			Departamento departamento) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.tipoEmpleado = tipoEmpleado;
		this.sueldos = sueldos;
		this.departamento = departamento;
	}
	

}
