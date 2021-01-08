import java.util.Random;

public abstract class Personaje extends Thread {
	private String nombre;
	private int vida;
	private Fortaleza fortaleza;

	@Override
	public void run() {
		fortaleza.entrarArena(this);
	}

	public void atacar(Personaje objetivo, int danio) {
		objetivo.setVida(objetivo.getVida() - danio);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", vida=" + vida + ", fortaleza=" + fortaleza + "]";
	}

	public Fortaleza getFortaleza() {
		return fortaleza;
	}

	public void setFortaleza(Fortaleza fortaleza) {
		this.fortaleza = fortaleza;
	}

}
