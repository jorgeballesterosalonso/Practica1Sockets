
public class Habitacion {

	private TipoHabitacion tipo;
	private double metros;

	public Habitacion(TipoHabitacion tipo, double metros) {
		super();
		this.tipo = tipo;
		this.metros = metros;
	}

	@Override
	public String toString() {
		return "Habitacion [tipo=" + tipo + ", metros=" + metros + "]";
	}

	public double getMetros() {
		return metros;
	}

}
