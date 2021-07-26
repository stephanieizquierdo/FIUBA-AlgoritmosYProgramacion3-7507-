

public class Vegeta extends Personaje {

    private double puntosDeVida = 6000;

    @Override
    public void atacarA(Personaje unPersonaje, Ataques unAtaque) {
        if(puntosDeVida<=0){
            throw new ElPersonajeEstaMuertoNoPuedeAtacar();
        }
        unAtaque.atacar(unPersonaje, this);
    }

    @Override
    public void atacarConGalickho(Personaje atacado, double puntosdeDanio){
        atacado.recibirDanio(puntosdeDanio+this.puntosDeVida*0.1);
    }

    @Override
    public void atacarConKamejameHa(Personaje atacado, double puntosDeDanio) {
        throw new ElPersonajeNoEntiendeElAtaque();
    }

    @Override
    public void recibirDanio(Double danio) {
        if(puntosDeVida<=0){
            throw new EnemigoestamuertoNoSeLoPuedeAtacar();
        }
        this.puntosDeVida -= danio;
    }

    @Override
    public double getPuntosDeVida(){
        return this.puntosDeVida;
    }


    public double efectoKaioken() {
        return 0; //a futuro podria veggueta tambien aprender hacer kaiokenes
    }

}
