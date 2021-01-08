
public class Curandero extends Personaje{

	@Override
	public void atacar(Personaje atacado) {
		System.out.println("Soy un curandero y te voy a descurar!!");
		getArma().usar();
		atacado.setVida(atacado.getVida()-getArma().getDaño());
	}

}
