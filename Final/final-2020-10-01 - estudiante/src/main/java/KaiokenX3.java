public class KaiokenX3 extends Kaioken {

    int turnosValidos = 3;

    public double efectoKaioken(Double puntos) {
        if(efectoEsValido()) {
            this.turnosValidos--;
            return (puntos * 0.15);
        }
        return 0;
    }

    protected boolean efectoEsValido(){
        return turnosValidos>0;
    }

    /*public double efectoRebote(Personaje atacante){
        return 0; //a futuro podria inflijir
    }*/
}
