package es.puentes.residencia;

import java.time.Instant;

public class AlojamientoImpl extends PrestacionImpl implements Alojamiento {

	private int idJaula;
	private final static float PRECIO_DIA = 15;
	
	public AlojamientoImpl() {}
	
	public AlojamientoImpl(Instant fechaEntrada, Instant fechaSalida, int idJaula) {
		super(fechaEntrada, fechaSalida);
		this.idJaula = idJaula;
	}
	
	@Override
	public int getIdJaula() {
		return idJaula;
	}
	
	@Override
	public float getPrecioDia() {
		return PRECIO_DIA;
	}

}
