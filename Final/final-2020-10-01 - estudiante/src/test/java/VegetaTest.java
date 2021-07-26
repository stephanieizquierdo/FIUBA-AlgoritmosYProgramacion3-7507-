import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class VegetaTest {


    private static final double DELTA = 1e-12; //lo uso porque uso un JUNIT 4 y sino me tira un warning

    @Test
    public void Test02VegetaSoloEntiendeGalickHoYBolaDeEnergia(){

        final Vegeta vegeta = new Vegeta();

        Goku goku = new Goku();

        assertThrows(ElPersonajeNoEntiendeElAtaque.class, () -> {
            vegeta.atacarA(goku, new KameHameHa());
        });
    }

    @Test
    public void Test03VegetaAtacaCOnGalickHoYhace100MasEl10PorcientoDeSuvida(){

        final Vegeta vegeta = new Vegeta();

        Goku goku = new Goku();

        vegeta.atacarA(goku,new GalickHo());

        assertEquals(4300,goku.puntosDeVida,DELTA);

    }

    @Test
    public void Test04VegetaNoEntiendeKamekameHa(){

        final Vegeta vegeta = new Vegeta();

        Goku goku = new Goku();

        assertThrows(ElPersonajeNoEntiendeElAtaque.class, () -> {
            vegeta.atacarA(goku, new KameHameHa());
        });
    }

}
