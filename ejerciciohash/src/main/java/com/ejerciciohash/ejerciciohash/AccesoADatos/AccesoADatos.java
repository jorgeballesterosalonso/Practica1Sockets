package com.ejerciciohash.ejerciciohash.AccesoADatos;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Optional;

import com.ejerciciohash.ejerciciohash.Entidad.Usuario;
import com.ejerciciohash.ejerciciohash.Persistencia.DaoUsuario;

import org.springframework.context.ApplicationContext;

public class AccesoADatos {

    private static DaoUsuario daoUsuario = null;

    public static void registrarUsuario(Usuario usuario) {
        byte[] contraseña = usuario.getPasswd().getBytes();

        try {
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            md.update(contraseña);
            byte[] contraseñaHasheada = md.digest();
            String contra = new String(contraseñaHasheada);
            System.out.println(contra);

            String contraseñaFinal = Base64.getEncoder().encodeToString(contraseñaHasheada);
            usuario.setPasswd(contraseñaFinal);
            System.out.println(contraseñaFinal);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        daoUsuario.save(usuario);
    }

    public static void setContext(ApplicationContext context) {
        daoUsuario = context.getBean("daoUsuario", DaoUsuario.class);
    }

    public static boolean loguearUsuario(Usuario u) {

        byte[] contraseña = u.getPasswd().getBytes();
        String contraseñaFinal = "";
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            md.update(contraseña);
            byte[] contraseñaHasheada = md.digest();
            String contra = new String(contraseñaHasheada);
            System.out.println(contra);

            contraseñaFinal = Base64.getEncoder().encodeToString(contraseñaHasheada);
            System.out.println(contraseñaFinal);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        Usuario obtenido = daoUsuario.findByNombre(u.getNombre());

        if (obtenido == null) {
            System.err.println("El usuario que buscas no está registrado en la BBDD");
            return false;
        }

        if (contraseñaFinal.equals(obtenido.getPasswd())) {
            return true;
        }

        return false;
    }
}
