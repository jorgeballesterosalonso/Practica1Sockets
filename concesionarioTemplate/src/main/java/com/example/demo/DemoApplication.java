package com.example.demo;

import java.lang.reflect.Proxy;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import main.java.com.example.demo.Entidad.Coche;
import main.java.com.example.demo.modelo.ProxyConcesionario;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		ProxyConcesionario proxy = context.getBean("proxyVehiculo",ProxyConcesionario.class);
		System.out.println("Listar");

		List<Coche> listaCoches = proxy.listar();
		for (Coche coche : listaCoches) {
			System.out.println(coche);
		}
	}

}
