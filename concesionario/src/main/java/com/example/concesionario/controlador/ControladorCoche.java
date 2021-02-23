package com.example.concesionario.controlador;

import java.util.List;

import com.example.concesionario.modelo.entidad.Coche;
import com.example.concesionario.modelo.negocio.GestionarCoches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorCoche {
    @Autowired
    private GestionarCoches gc;

    @GetMapping("coche")
    public ResponseEntity<List<Coche>> listar() {
        List<Coche> lista = gc.listar();
        ResponseEntity<List<Coche>> re = new ResponseEntity<List<Coche>>(lista, HttpStatus.OK);
        return re;
    }

    @GetMapping("coche/{id}")
    public ResponseEntity<Coche> obtener(@PathVariable("id") int id) {
        Coche p = gc.obtenerCoche(id);
        HttpStatus codigoRespuesta = null;

        if (p != null) {
            codigoRespuesta = HttpStatus.OK;
        } else {
            codigoRespuesta = HttpStatus.NOT_FOUND;
        }

        ResponseEntity<Coche> re = new ResponseEntity<Coche>(p, codigoRespuesta);
        return re;
    }

    @PostMapping("coche")
    public ResponseEntity<Coche> alta(@RequestBody Coche persona) {
        Coche p = null;
        try {
            p = gc.altaCoche(persona);
        } catch (IllegalArgumentException e) {
            System.out.println("Has insertado un coche con un maatrícula existente");
        }

        HttpStatus codigoRespuesta = null;

        if (p != null) {
            codigoRespuesta = HttpStatus.CREATED;
        } else {
            codigoRespuesta = HttpStatus.BAD_REQUEST;
        }
        ResponseEntity<Coche> re = new ResponseEntity<Coche>(p, codigoRespuesta);
        return re;
    }

    @PutMapping("coche/{id}")
    public ResponseEntity<Coche> modificar(@RequestBody Coche coche, @PathVariable("id") int id) {

        coche.setId(id);
        Coche p = null;
        try {
            p = gc.modificarCoche(coche);
        } catch (IllegalArgumentException e) {
            System.out.println("Estás intentando poner a este coche una matrícula ya existente");
        }
        HttpStatus codigoRespuesta = null;

        if (p != null) {
            codigoRespuesta = HttpStatus.OK;

        } else {
            codigoRespuesta = HttpStatus.BAD_REQUEST;

        }
        ResponseEntity<Coche> re = new ResponseEntity<Coche>(p, codigoRespuesta);
        return re;

    }

    @DeleteMapping("coche/{id}")
    public ResponseEntity<Integer> borrar(@PathVariable("id") int id) {

        boolean borrado = gc.borrarCoche(id);
        HttpStatus codigoRespuesta = null;

        if (borrado) {
            codigoRespuesta = HttpStatus.OK;

        } else {
            codigoRespuesta = HttpStatus.BAD_REQUEST;

        }
        return new ResponseEntity<Integer>(id, codigoRespuesta);

    }
}
