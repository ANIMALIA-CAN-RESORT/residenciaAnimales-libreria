package es.puentes.residencia;

import java.time.Instant;

public class AlojamientoImpl extends PrestacionImpl implements Alojamiento {

	private String jaula;
	private final static float PRECIO_DIA = 15;
	
	public AlojamientoImpl() {}
	
	@Override
	public String getJaula() {
		return jaula;
	}
	
	@Override
	public float getPrecioDia() {
		return PRECIO_DIA;
	}

}
