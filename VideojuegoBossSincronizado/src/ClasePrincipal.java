
public class ClasePrincipal {

	public static void main(String[] args) {
		Fortaleza fortaleza = new Fortaleza();
		Personaje mago = new Mago();
		Personaje guerrero = new Guerrero();
		Personaje boss = new Boss();

		boss.setNombre("Rata Bastarda");
		boss.setVida(80);
		fortaleza.setBoss(boss);

		mago.setNombre("Gandalf");
		mago.setVida(40);
		mago.setFortaleza(fortaleza);

		guerrero.setNombre("Conan");
		guerrero.setVida(35);
		guerrero.setFortaleza(fortaleza);

		mago.start();
		guerrero.start();
	}

}
