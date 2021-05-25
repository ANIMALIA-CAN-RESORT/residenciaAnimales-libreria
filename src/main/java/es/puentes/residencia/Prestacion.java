package es.puentes.residencia;

import java.time.Instant;

public interface Prestacion {

	Instant getFechaEntrada();
	Instant getFechaSalida();
	float getPrecioDia();
	float getPrecioPrestacion();
	boolean isPagada();
}
