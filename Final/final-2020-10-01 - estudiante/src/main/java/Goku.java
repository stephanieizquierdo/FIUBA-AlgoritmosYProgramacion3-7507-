public class Goku extends Personaje{

    public double puntosDeVida = 5000;

    public Kaioken kaioKen = new SinKaioken();

    public void atacarA(Personaje unPersonaje, Ataques unAtaque) {
        if(puntosDeVida<=0){
            throw new ElPersonajeEstaMuertoNoPuedeAtacar();
        }
        unAtaque.atacar(unPersonaje, this);
    }

    public void atacarConKamejameHa(Personaje atacado, double puntosdeDanio){
        atacado.recibirDanio(puntosdeDanio);
    }

    public void atacarConGalickho(Personaje atacado, double puntosdeDanio){
        throw new ElPersonajeNoEntiendeElAtaque();
    }

    public void recibirDanio(Double danio) {
        if(puntosDeVida<=0){
            throw new EnemigoestamuertoNoSeLoPuedeAtacar();
        }
        this.puntosDeVida -= danio;
    }

    public void aplicarKaiohKen(Kaioken unKaioken){
        this.kaioKen = unKaioken;
    }

    public double efectoKaioken(){
        return this.kaioKen.efectoKaioken((double) this.puntosDeVida);
    }

    public double getPuntosDeVida(){
        return this.puntosDeVida;
    }

}
