
public class Persona {

	private String nombre;
	private int edad;
	private Direccion direccion;
	
	public Persona(String nombre, int edad, Direccion direccion) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", direccion=" + direccion + "]";
	}
	
}
