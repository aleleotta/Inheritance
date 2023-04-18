package exercise1;

public class Hour {
	private int hour = 0;
	private int minute = 0;
	
	public Hour(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}
	
	public void increase() {
		minute++;
	}
	
	public void print() {
		System.out.println("Hour: " + );
	}
	
	public boolean setHour(int hour) {
		boolean valid = false;
		if(hour < 23 && !(hour < 0)) {
			valid = true;
			this.hour = hour;
		}
		return valid;
	}
	
	public int getHour() {
		return hour;
	}

	public boolean setMinutes(int minute) {
		boolean valid = false;
		if(minute >= 0) {
			valid = true;
			this.minute = minute;
		}
		return valid;
	}
	
	public int getMinute() {
		return minute;
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