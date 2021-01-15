package com.ejercicio.ejercicio.controlador;

import com.entidad.Videojuego;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorVideojuego {
    static Videojuego v = new Videojuego();
    @GetMapping("videojuego")
    public static Videojuego obtenervideojuego() {

        
        v.setCompania("sandbox Interactive");
        v.setId(0);
        v.setNombre("Albion Online");
        v.setPrecio(20);

        return v;

    }

    @PutMapping("videojuego")
    public static Videojuego cambiarPrecioVideojuego() {
        v.setPrecio(v.getPrecio()+5);
        return v;
    }
}
