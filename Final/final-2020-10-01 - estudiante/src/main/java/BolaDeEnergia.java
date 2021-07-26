public class BolaDeEnergia implements Ataques {

    private int puntosDeAtaque = 50;

    public void atacar(Personaje atacado, Personaje atacante) {
        atacado.recibirDanio((double) puntosDeAtaque);
    }
}
