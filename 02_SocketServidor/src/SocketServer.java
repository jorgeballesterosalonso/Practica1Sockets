import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
	public static final int PUERTO = 2017;
	public static final String IP_SERVER = "localhost";

	public static void main(String[] args) {

		ServerSocket servidorSocket = null;
		Socket socketConexion = null;

		PrintStream salida = null;
		InputStreamReader entrada = null;

		try {
			servidorSocket = new ServerSocket();
			InetSocketAddress direccion = new InetSocketAddress(IP_SERVER, PUERTO);

			servidorSocket.bind(direccion);
			while (true) {
				System.out.println("SERVIDOR: Esperando petición...");
				socketConexion = servidorSocket.accept();

				entrada = new InputStreamReader(socketConexion.getInputStream());
				BufferedReader bf = new BufferedReader(entrada);

				String stringRecibido = bf.readLine();

				String[] operadores = stringRecibido.split("-");

				int numero1 = Integer.parseInt(operadores[0]);

				if (numero1 == 0) {
					System.out.println("Finalizando ejecución...");
					break;
				}
				System.out.println("SERVIDOR: me ha llegado del cliente: " + stringRecibido);

				int numero2 = Integer.parseInt(operadores[1]);
				int operacion = Integer.parseInt(operadores[2]);
				int resultado = 0;
				String tipoOperacion = "";

				switch (operacion) {
				case 1: {
					resultado = numero1 + numero2;
					tipoOperacion = "Suma";
					break;
				}
				case 2: {
					resultado = numero1 - numero2;
					tipoOperacion = "Resta";
					break;
				}
				case 3: {
					resultado = numero1 * numero2;
					tipoOperacion = "Multiplicación";
					break;
				}
				case 4: {
					resultado = numero1 / numero2;
					tipoOperacion = "División";
					break;
				}
				}
				System.out.println("SERVIDOR: Tipo de operación realizada: " + tipoOperacion);
				salida = new PrintStream(socketConexion.getOutputStream());
				salida.println(resultado);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
