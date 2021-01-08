package PrimosHilos;

import java.util.Scanner;

public class MainPrimos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		int numero3 = sc.nextInt();
		
		Hilos hilo1 = new Hilos(numero1);
		hilo1.setName("Hilo del número "+numero1);
		
		Hilos hilo2 = new Hilos(numero2);
		hilo2.setName("Hilo del número "+numero2);
		
		Hilos hilo3 = new Hilos(numero3);
		hilo3.setName("Hilo del número "+numero3);
		
		hilo1.start();
		hilo2.start();
		hilo3.start();
		
	}

}
