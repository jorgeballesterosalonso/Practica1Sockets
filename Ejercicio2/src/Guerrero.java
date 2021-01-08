
public class Guerrero extends Personaje {

	@Override
	public void atacar(Personaje atacado) {

		System.out.println("Soy un guerrero y te mataré AAARGGG!!!");
		getArma().usar();
		atacado.setVida(atacado.getVida()-getArma().getDaño());

	}

}
