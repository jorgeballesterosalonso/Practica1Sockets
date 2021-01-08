
public class Espada extends Arma {

	@Override
	public void usar() {
		System.out.println("SWIIIING");
		System.out.println("Tipo: " + getTipo() + ", Daño: " + getDaño());
	}

}
