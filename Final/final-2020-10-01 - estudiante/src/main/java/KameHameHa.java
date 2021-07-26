public class KameHameHa implements Ataques{

    private int puntosDeAtaque = 100;

    public void atacar(Personaje atacado, Personaje atacante) {

        double puntosExtras = atacante.efectoKaioken();

        atacante.atacarConKamejameHa(atacado, puntosDeAtaque + puntosExtras);

    }
}
