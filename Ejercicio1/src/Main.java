import java.util.ArrayList;

public class Main {
	static ArrayList<Habitacion> habitaciones = new ArrayList<Habitacion>();

	public static void main(String[] args) {

		Direccion direccionCasa = new Direccion("Avenida", "Salchichones", "28510", 35);
		Direccion direccionPropietario = new Direccion("Calle", "Espárragos", "28169", 28);

		Persona propietario = new Persona("Jose", 40, direccionPropietario);
		Persona inquilino = new Persona("Paco", 26, direccionCasa);

		Habitacion banio = new Habitacion(TipoHabitacion.BANIO, 5);
		Habitacion cocina = new Habitacion(TipoHabitacion.COCINA, 15);
		Habitacion dormitorio = new Habitacion(TipoHabitacion.DORMITORIO, 15);
		Habitacion dormitorio2 = new Habitacion(TipoHabitacion.BANIO, 10);
		Habitacion dormitorio3 = new Habitacion(TipoHabitacion.BANIO, 11);

		habitaciones.add(banio);
		habitaciones.add(cocina);
		habitaciones.add(dormitorio);
		habitaciones.add(dormitorio2);
		habitaciones.add(dormitorio3);

		Casa apartamento = new Casa(direccionCasa, habitaciones, propietario, inquilino, metrosCasa());
		System.out.println(apartamento.toString());

	}

	public static double metrosCasa() {
		double m = 0;
		for (int i = 0; i < habitaciones.size(); i++) {

			m += habitaciones.get(i).getMetros();
		}
		return m;
	}

}
