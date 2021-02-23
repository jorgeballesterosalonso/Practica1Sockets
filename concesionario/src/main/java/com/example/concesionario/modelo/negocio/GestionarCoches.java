package com.example.concesionario.modelo.negocio;

import java.util.List;
import java.util.Optional;

import com.example.concesionario.modelo.entidad.Coche;
import com.example.concesionario.modelo.persistencia.DaoCoche;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GestionarCoches {
    @Autowired
    private DaoCoche daoCoche;

    public List<Coche> listar() {
        List<Coche> lista = daoCoche.findAll();
        return lista;
    }

    /**
     * Método que devuelve un coche al introducir su id
     * 
     * @param id
     * @return el coche correspondiente al id
     */
    public Coche obtenerCoche(int id) {
        Optional<Coche> opt = daoCoche.findById(id);
        // Si no encuentra el objeto, el optional estaría vacío

        if (opt.isPresent()) {
            return daoCoche.findById(id).get();
        }
        return null;
    }

    /**
     * Da de alta un coche en la BBDD si su potencia es mayor a 0 y si su matrícula
     * es única
     * 
     * @param coche
     * @return
     */
    public Coche altaCoche(Coche coche) throws IllegalArgumentException {
        // Podríamos poner toda la logica de la aplicacion que queramos
        // En caso de que tengamos una regla de negocio en el que el nombre
        // tenga que tener al menos 3 caracteres, la pondríamos aquí

        if (coche.getPotencia() < 0.0) {
            return null;
        }
        Coche c = daoCoche.save(coche);
        return c;

    }

    public Coche modificarCoche(Coche coche) throws IllegalArgumentException {
        if (coche.getPotencia() < 0.0) {
            return null;
        }

        Coche c = daoCoche.save(coche);

        return c;
    }

    public boolean borrarCoche(int id) {
        if (daoCoche.findById(id).isPresent()) {
            daoCoche.deleteById(id);
            return true;
        }
        return false;
    }
}