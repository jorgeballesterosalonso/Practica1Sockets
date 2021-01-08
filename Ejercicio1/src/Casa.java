import java.util.ArrayList;

public class Casa {

	private Direccion direccion;
	private ArrayList<Habitacion> habitaciones;
	private Persona propietario;
	private Persona inquilino;
	private double metros;

	public Casa(Direccion direccion, ArrayList<Habitacion> habitaciones, Persona propietario, Persona inquilino,
			double metros) {
		super();
		this.direccion = direccion;
		this.habitaciones = habitaciones;
		this.propietario = propietario;
		this.inquilino = inquilino;
		this.metros = metros;
	}

	@Override
	public String toString() {
		return "Casa \n [" + direccion.toString() + "\n Habitaciones=" + habitaciones.toString() + "\n Propietario="
				+ propietario.toString() + "\n Inquilino=" + inquilino.toString() + "\n Metros cuadrados=" + metros
				+ "]";
	}
}
