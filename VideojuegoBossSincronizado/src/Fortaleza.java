import java.util.Random;

public class Fortaleza {
	Personaje boss;

	public synchronized void entrarArena(Personaje jugador) {
		Random random = new Random();
		
		System.out.println("LA BATALLA EMPIEZA: "+jugador.getNombre()+boss.getNombre());

		while (jugador.getVida() > 0 && boss.getVida() > 0) {
			jugador.atacar(boss, random.nextInt(10) + 1);
			System.out.println(jugador.getNombre() + " ataca a " + boss.getNombre());
			boss.atacar(jugador, random.nextInt(10) + 1);
			System.out.println(boss.getNombre() + " ataca a " + jugador.getNombre());
		}

		System.out.println("EL COMBATE HA TERMINADO, EL RESULTADO ES:" + jugador.toString() + boss.toString());

	}

	public Personaje getBoss() {
		return boss;
	}

	public void setBoss(Personaje boss) {
		this.boss = boss;
	}

}
