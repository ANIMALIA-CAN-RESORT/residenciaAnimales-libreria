package es.puentes.residencia;

import java.util.ArrayList;
import java.util.Collection;

public class Mascota {

	private String nombre;
	private String chip;
	private String raza;
	private String talla;//será "S", "M", "L", "XL"
	private Collection<Prestacion> prestaciones = new ArrayList<Prestacion>();

	
	public Mascota() {
		super();
	}
	

	public String getNombre() {
		return nombre;
	}
	
	public String getChip() {
		return chip;
	}
	
	public String getRaza() {
		return raza;
	}
	
	public String getTalla() {
		return talla;
	}
	
	public Collection<Prestacion> getPrestaciones() {
		return prestaciones;
	}
	
	public void setPrestaciones(Collection<Prestacion> prestaciones) {
		this.prestaciones = prestaciones;
	}

	@Override
	public String toString() {
		return "Mascota " + getNombre() + ", de raza " + getRaza() + ", de talla " + getTalla() + ", y chip " + getChip();
	}
	
}
