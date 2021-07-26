public abstract class Personaje {


    public abstract void atacarA(Personaje unPersonaje, Ataques unAtaque);

    public abstract void recibirDanio(Double danio);

    public abstract double efectoKaioken();

    public abstract double getPuntosDeVida();

    public abstract void atacarConKamejameHa(Personaje atacado, double puntosDeDanio);
    
    public abstract void atacarConGalickho(Personaje atacado, double puntosDeDanio);
    
}
