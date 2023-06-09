package exercise1;

public class ExactHour extends Hour {
	private int second = 0;
	
	public ExactHour() {}
	
	public ExactHour(int hour, int minute, int second) {
		super(hour, minute);
		this.second = second;
	}
	
	public void increase() {
		second++;
	}

	public boolean setSecond(int second) {
		boolean valid = false;
		if(second < 59 && !(second < 0)) {
			valid = true;
			this.second = second;
		}
		return valid;
	}
	
	public int getSecond() {
		return second;
	}

	@Override
	public String toString() {
		return super.toString() + ":" + second;
	}
	
}

/*
Diseñar la clase Hora, que representa un instante de tiempo compuesto por la hora (de 0 a 23) y los minutos.
Dispone de los siguientes métodos:
	Hora(hora, minuto): construye un objeto con los datos pasados como parámetros.
	void inc(): incrementa la hora en un minuto.
	boolean setMinutos(valor): asigna un valor, si es válido, a los minutos.
	Devuelve true o false según haya sido posible modificar los minutos o no.
	boolean setHora(valor): asigna un valor, si está comprendido entre 0 y 23, a la hora.
	Devuelve true o false según haya sido posible cambiar la hora o no.
	String toString(): devuelve un String con la representación de la hora: hora:minutos.
A partir de la clase Hora, implementar la clase HoraExacta, que incluye en la hora los segundos.
Además de los métodos heredados de Hora dispondrá de:
	HoraExacta(hora, minuto, segundo): construye un objeto con los datos pasados como parámetros.
	setSegundo(valor): asigna, si está comprendido entre 0 y 59, el valor indicado a los segundos.
	inc(): incrementa la hora en un segundo. Hará uso del método inc() de la superclase.
*/