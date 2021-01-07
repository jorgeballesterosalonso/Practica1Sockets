import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class SocketCliente {
	public static final int PUERTO = 2017;
	public static final String IP_SERVER = "localhost";

	public static void main(String[] args) {
		System.out.println("          APLICACIÓN CLIENTE          ");
		System.out.println("--------------------------------------");

		Socket socketCliente = null;
		InputStreamReader entrada = null;
		PrintStream salida = null;
		InetSocketAddress direccionServidor = new InetSocketAddress(IP_SERVER, PUERTO);
		Scanner sc = new Scanner(System.in);
		try {
			socketCliente = new Socket();
			socketCliente.connect(direccionServidor);
			System.out.println("Conexión establecida a " + IP_SERVER + " por el puerto " + PUERTO);

			entrada = new InputStreamReader(socketCliente.getInputStream());
			salida = new PrintStream(socketCliente.getOutputStream());

			System.out.println("Cliente, introduzca los números a operar ");

			String numero1 = sc.nextLine();
			System.out.println("Ahora introduzca el segundo número a operar: ");
			String numero2 = sc.nextLine();
			System.out.println("Indique, por favor, el tipo de operación que desea hacer:");
			System.out.println("1) Sumar");
			System.out.println("2) Restar");
			System.out.println("3) Multiplicar");
			System.out.println("4) Dividir");
			String operacion = sc.nextLine();

			String operandos = numero1 + "-" + numero2 + "-" + operacion;

			salida.println(operandos);

			BufferedReader bf = new BufferedReader(entrada);
			String resultado = bf.readLine();
			System.out.println("El resultado de la operacion entre " + numero1 + " y " + numero2 + " es: " + resultado);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				salida.close();
				entrada.close();
				socketCliente.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
