public class GalickHo implements Ataques{

    private int puntosDeDanio = 100;

    public void atacar(Personaje atacado, Personaje atacante) {
        atacante.atacarConGalickho(atacado, puntosDeDanio );
    }
}
