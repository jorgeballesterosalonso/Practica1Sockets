package PrimosHilos;

import java.util.Date;

public class Hilos extends Thread {
	int numeroACalcular;

	public Hilos(int numeroACalcular) {
		this.numeroACalcular = numeroACalcular;
	}

	@Override
	public void run() {
		Date dateInicial = new Date();
		double tiempoInicial = dateInicial.getTime();

		for (int i = 2; i < numeroACalcular; i++) {
			if (numeroACalcular % i == 0) {
				System.out.println("El número " + numeroACalcular + " no es primo");
				Date dateFinal = new Date();
				double tiempofinal = dateFinal.getTime();
				System.out.println("El tiempo del hilo " + this.getName() + " han sido: "
						+ (tiempofinal- tiempoInicial) + " milisegundos");
				this.stop();
			}
		}
		Date dateFinal = new Date();
		double tiempofinal = dateFinal.getTime();
		System.out.println("El tiempo del hilo " + this.getName() + " han sido: " + (tiempofinal- tiempoInicial)
				+ " milisegundos");
	}
}
