package es.puentes.residencia;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class AlimentacionImpl extends PrestacionImpl implements Alimentacion {

	private String tipoComida;//será "NORMAL" o "PREMIUM
	private float cantidadComidaDiaria;//será multiplo de 50 gramos, en función de la talla de la mascota
	private final static float PRECIO_NORMAL_CINCUENTA = 2.5f;
	private final static float PRECIO_PREMIUM_CINCUENTA = 3.5f;
	
	public String getTipoComida() {
		return tipoComida;
	}
	
	public void setTipoComida(String tipoComida) {
		this.tipoComida = tipoComida;
	}
	
	@Override
	public float getCantidadComidaDiaria() {
		return cantidadComidaDiaria;
	}
	
	public static float getPrecioNormalCincuenta() {
		return PRECIO_NORMAL_CINCUENTA;
	}
	
	public static float getPrecioPremiumCincuenta() {
		return PRECIO_PREMIUM_CINCUENTA;
	}
	
	public AlimentacionImpl() {}
	
	@Override
	public float getPrecioDia() {
		float resultado = 0; 
		if (getTipoComida().equals("NORMAL")) {
			resultado = getCantidadComidaDiaria()/50 * getPrecioNormalCincuenta(); //si la cantidad fueran 100 quiero que el precio sea 2 x PRECIOCINCUENTA
		}
		else if (getTipoComida().equals("PREMIUM")) {
			resultado = getCantidadComidaDiaria()/50 * getPrecioPremiumCincuenta(); //si la cantidad fueran 100 quiero que el precio sea 2 x PRECIOCINCUENTA
		}
		return resultado;
	}

	@Override
	public float getCantidadComidaTotal() {
		return getFechaEntrada().until(getFechaSalida(), ChronoUnit.DAYS) * getCantidadComidaDiaria();
	}
}

