package es.puentes.residencia;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public abstract class PrestacionImpl implements Prestacion {

	private Instant fechaEntrada, fechaSalida;
	private boolean pagada;
	
	public PrestacionImpl() {}
	
	@Override
	public Instant getFechaEntrada() {
		return fechaEntrada;
	}

	@Override
	public Instant getFechaSalida() {
		return fechaSalida;
	}
		
	public boolean isPagada() {
		return pagada;
	}
	
	public void setPagada(boolean pagada) {
		this.pagada = pagada;
	}

	@Override
	public abstract float getPrecioDia();
	
	@Override
	public float getPrecioPrestacion() {
		return getFechaEntrada().until(getFechaSalida(), ChronoUnit.DAYS) * getPrecioDia();
	}
}
