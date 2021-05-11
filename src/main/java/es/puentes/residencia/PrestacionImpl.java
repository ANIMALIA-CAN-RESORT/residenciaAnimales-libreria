package es.puentes.residencia;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

import es.lanyu.commons.servicios.entidad.ServicioEntidad;

public abstract class PrestacionImpl implements Prestacion {

	private Instant fechaEntrada, fechaSalida;
	transient protected ServicioEntidad servicioEntidad;

	
	public PrestacionImpl() {}
	
	public PrestacionImpl(Instant fechaEntrada, Instant fechaSalida) {
		super();
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
	}


	@Override
	public Instant getFechaEntrada() {
		return fechaEntrada;
	}

	@Override
	public Instant getFechaSalida() {
		return fechaSalida;
	}

	@Override
	public abstract float getPrecioDia();
	
	@Override
	public float getPrecioPrestacion() {
		return getFechaEntrada().until(getFechaSalida(), ChronoUnit.DAYS) * getPrecioDia();
	}
}
