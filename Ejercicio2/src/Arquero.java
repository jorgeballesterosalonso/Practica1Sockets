
public class Arquero extends Personaje {

	@Override
	public void atacar(Personaje atacado) {
		System.out.println("Soy un arquero y te mataré AAAAAAAAAA");
		getArma().usar();
		atacado.setVida(atacado.getVida() - getArma().getDaño());
	}

}
