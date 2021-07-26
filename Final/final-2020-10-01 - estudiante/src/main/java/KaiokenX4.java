public class KaiokenX4 extends Kaioken {

    int turnosValidos = 2;

    public double efectoKaioken(Double puntos) {
        if(efectoEsValido()) {
            this.turnosValidos--;

          //  efectoRebote();

            return (800);
        }
        return 0;
    }

    protected boolean efectoEsValido(){
        return turnosValidos>0;
    }

   /* public double efectoRebote(Personaje atacante){
        atacante.recibirDanio(300);
    }*/
}