package es.puentes.residencia;

import java.util.Collection;

public class Cliente {

	private String dni;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String tfno;
	private String email;
	private Collection<Mascota> mascotas;

	public Cliente() {
		super();
	}

	public Cliente(String dni, String nombre, String apellido1, String apellido2, String tfno, String email) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.tfno = tfno;
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}
	
	public String getApellido1() {
		return apellido1;
	}
	
	public String getApellido2() {
		return apellido2;
	}
	
	public String getDni() {
		return dni;
	}
	
	public String getTfno() {
		return tfno;
	}
	
	public String getEmail() {
		return email;
	}
	
	public Collection<Mascota> getMascotas() {
		return mascotas;
	}
	
	public void setMascotas(Mascota mascota) {
		mascotas.add(mascota);
	}
	
	public String getApellidos() {
		return (getApellido2() != "") ? getApellido1() + " " + getApellido2() : getApellido1();
	}


	@Override
	public String toString() {
		return getNombre() + " " + getApellidos()
				+ ", con DNI " + getDni() + ", TFNO: " + getTfno() + ", email: " + getEmail();
	}
}
