
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GokuTest {

    private static final double DELTA = 1e-12; //lo uso porque uso un JUNIT 4 y sino me tira un warning

    @Test
    public void Test01GokuComienzaSinKaihokenYAtaqueKamekamehaHace100DeDanio(){
        Goku goku = new Goku();
        Vegeta vegeta = new Vegeta();

        goku.atacarA(vegeta, new KameHameHa());

        assertEquals(5900, vegeta.getPuntosDeVida(), DELTA);
    }

    @Test
    public void Test02GokuConKaihokenHaceMasDaño(){
        Goku goku = new Goku();
        Vegeta vegeta = new Vegeta();

        goku.aplicarKaiohKen(new KaiokenX1());

        goku.atacarA(vegeta, new KameHameHa());

        assertEquals(5650, vegeta.getPuntosDeVida(), DELTA);
    }

    @Test
    public void Test03GokuEntiendeAtaqueBolaDeEnergia(){
        Goku goku = new Goku();
        Vegeta vegeta = new Vegeta();

        goku.atacarA(vegeta, new BolaDeEnergia());

        assertEquals(5950, vegeta.getPuntosDeVida(), DELTA);
    }

    @Test
    public void Test04BolaDeEnergiaHaceElMismoEfectoAPesarQueGokuTengaKaiokens(){
        Goku goku = new Goku();
        Vegeta vegeta = new Vegeta();

        goku.aplicarKaiohKen(new KaiokenX1());
        goku.atacarA(vegeta, new BolaDeEnergia());

        assertEquals(5950, vegeta.getPuntosDeVida(), DELTA);
    }

    @Test
    public void Test05GokuNoEntiendeAtaqueGalickHo(){
        Goku goku = new Goku();
        Vegeta vegeta = new Vegeta();

        assertThrows(ElPersonajeNoEntiendeElAtaque.class, () -> {
            goku.atacarA(vegeta, new GalickHo());
        });
    }

    @Test
    public void Test06GokuSoloPuedeUsar4VecesKaiokenX1(){
        Goku goku = new Goku();
        Vegeta vegeta = new Vegeta();

        goku.aplicarKaiohKen(new KaiokenX1());

        goku.atacarA(vegeta, new KameHameHa());
        goku.atacarA(vegeta, new KameHameHa());
        goku.atacarA(vegeta, new KameHameHa());
        goku.atacarA(vegeta, new KameHameHa()); //Hasta aca la vida de vegueta es  4600

        goku.atacarA(vegeta, new KameHameHa()); //hace solo 100 de danio

        assertEquals(4500, vegeta.getPuntosDeVida(), DELTA);
    }

    @Test
    public void Test07GokuUsaKaioken4YHace800DeDanioYSufre300DePerdidaDeDanio(){
        Goku goku = new Goku();
        Vegeta vegeta = new Vegeta();

        goku.aplicarKaiohKen(new KaiokenX4());
        goku.atacarA(vegeta, new KameHameHa()); //va a restar 800 mas los 100 del kamekameha

        assertEquals(5100, vegeta.getPuntosDeVida(), DELTA);
    }

}
