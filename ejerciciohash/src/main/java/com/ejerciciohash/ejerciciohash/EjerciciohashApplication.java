package com.ejerciciohash.ejerciciohash;

import com.ejerciciohash.ejerciciohash.AccesoADatos.AccesoADatos;
import com.ejerciciohash.ejerciciohash.Entidad.Usuario;
import com.ejerciciohash.ejerciciohash.entradaSalida.EntradaSalida;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EjerciciohashApplication {

	public static ApplicationContext context = null;

	public static void main(String[] args) {
		context = SpringApplication.run(EjerciciohashApplication.class, args);
		AccesoADatos.setContext(context);
		int eleccion = EntradaSalida.mostrarMenu();

		while (eleccion != 0) {

			switch (eleccion) {
				case EntradaSalida.INICIAR_SESION:
					Usuario u = EntradaSalida.pedirDatosUsuario();
					if (AccesoADatos.loguearUsuario(u)) {
						System.out.println("HAS INICIADO SESIÓN");
					} else {
						System.out.println("LOGIN ERRÓNEO");
					}
					break;
				case EntradaSalida.REGISTRARSE:
					Usuario user = EntradaSalida.pedirDatosUsuario();
					AccesoADatos.registrarUsuario(user);
					break;
				default:
					break;
			}
			eleccion = EntradaSalida.mostrarMenu();
		}
	}

}
