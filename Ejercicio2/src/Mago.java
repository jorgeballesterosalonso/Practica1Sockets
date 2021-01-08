
public class Mago extends Personaje{

	@Override
	public void atacar(Personaje atacado) {
		
		System.out.println("Soy un mago y te voy a hechizar!!!");
		getArma().usar();
		atacado.setVida(atacado.getVida()-getArma().getDaño());
	}

}
