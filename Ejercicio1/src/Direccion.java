
public class Direccion {
	private String tipoVia;
	private String calle;
	private String cp;
	private int numero;

	public Direccion(String tipoVia, String calle, String cp, int numero) {
		super();
		this.tipoVia = tipoVia;
		this.calle = calle;
		this.cp = cp;
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Direccion [tipoVia=" + tipoVia + ", calle=" + calle + ", cp=" + cp + ", numero=" + numero + "]";
	}
}
