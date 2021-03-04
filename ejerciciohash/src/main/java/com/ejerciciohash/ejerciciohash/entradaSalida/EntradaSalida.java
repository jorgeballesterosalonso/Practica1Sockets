package com.ejerciciohash.ejerciciohash.entradaSalida;

import java.util.Scanner;

import com.ejerciciohash.ejerciciohash.Entidad.Usuario;

public class EntradaSalida {

    public static final int INICIAR_SESION = 2;
    public static final int REGISTRARSE = 1;
    public static final int SALIR = 0;
    private static Scanner sc = new Scanner(System.in);

    public static int mostrarMenu() {
        int opcion = 0;

        System.out.println("Menú de Login, escoja una opción:");
        System.out.println("1) Registrarse");
        System.out.println("2) Iniciar sesión");

        opcion = sc.nextInt();

        return opcion;
    }

    public static Usuario pedirDatosUsuario() {
        Usuario u = new Usuario();
        System.out.println("Ingrese el nombre de usuario");
        String nombre = sc.next();
        System.out.println("Ingrese la contraseña");
        String passwd = sc.next();
        u.setNombre(nombre);
        u.setPasswd(passwd);
        return u;
    }
}
