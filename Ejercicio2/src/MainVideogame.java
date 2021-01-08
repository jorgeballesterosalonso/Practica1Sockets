import java.util.Arrays;
import java.util.Random;

public class MainVideogame {

	public static void main(String[] args) {
		Personaje guerrero = new Guerrero();
		Personaje arquero = new Arquero();
		Personaje curandero = new Curandero();
		Personaje mago = new Mago();

		Arma espada = new Espada();
		Arma arco = new Arco();
		Arma varita = new Varita();
		Arma Baston = new Baston();

		// Creo guerrero
		guerrero.setVida(1000);
		guerrero.setArma(espada);
		guerrero.getArma().setDaño(30 + (int) Math.random() * 10);
		guerrero.getArma().setTipo("Espada Bastarda");

		// Creo arquero
		arquero.setVida(900);
		arquero.setArma(arco);
		arquero.getArma().setDaño(40 + (int) Math.random() * 10);
		arquero.getArma().setTipo("Arco Largo");

		// Creo mago
		mago.setVida(600);
		mago.setArma(varita);
		mago.getArma().setDaño(60 + (int) Math.random() * 10);
		mago.getArma().setTipo("Varita de Sauco");

		// Creo curandero
		curandero.setVida(800);
		curandero.setArma(Baston);
		curandero.getArma().setDaño(35 + (int) Math.random() * 10);
		curandero.getArma().setTipo("Bastón de los oídos");

		Random rm = new Random();

		// Comienza la batalla
		while (guerrero.getVida() > 0 || arquero.getVida() > 0 || curandero.getVida() > 0 || mago.getVida() > 0) {

			Personaje[] lista = { guerrero, curandero, mago, arquero };

			// ataca el guerrero

			Personaje atacado = lista[rm.nextInt(4)];
			guerrero.atacar(atacado);
			System.out.println("Vida restante del " + atacado.getNombre() + " es: " + atacado.getVida());

			// Ataca el arquero
			atacado = lista[rm.nextInt(4)];
			arquero.atacar(atacado);
			System.out.println("Vida restante del " + atacado.getNombre() + " es: " + atacado.getVida());

			// Ataca el mago
			atacado = lista[rm.nextInt(4)];
			mago.atacar(atacado);
			System.out.println("Vida restante del " + atacado.getNombre() + " es: " + atacado.getVida());

			// Ataca el curandero
			atacado = lista[rm.nextInt(4)];
			curandero.atacar(atacado);
			System.out.println("Vida restante del " + atacado.getNombre() + " es: " + atacado.getVida());

		}
		int[] vidas = { guerrero.getVida(), arquero.getVida(), mago.getVida(), curandero.getVida() };

		Arrays.sort(vidas);

		System.out.println("------------------------------------------");
		System.out.println("Vida restante del arquero: " + arquero.getVida());
		System.out.println("Vida restante del mago: " + mago.getVida());
		System.out.println("Vida restante del curandero: " + curandero.getVida());
		System.out.println("Vida restante del guerrero: " + guerrero.getVida());

		if (vidas[0] == guerrero.getVida()) {
			System.out.println("Ha ganado el guerrero!!");

		} else if (vidas[0] == arquero.getVida()) {
			System.out.println("Ha ganado el arquero!!");

		} else if (vidas[0] == mago.getVida()) {
			System.out.println("Ha ganado el mago!!");

		} else if (vidas[0] == curandero.getVida())
			System.out.println("Ha ganado el curandero!!");
	}
}
