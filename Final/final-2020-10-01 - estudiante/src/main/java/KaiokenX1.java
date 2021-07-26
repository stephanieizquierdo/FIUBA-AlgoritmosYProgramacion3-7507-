public class KaiokenX1 extends Kaioken{

    int turnosValidos = 4;

    public double efectoKaioken(Double puntos) {
        if(efectoEsValido()) {
            this.turnosValidos--;
            return (puntos * 0.05);
        }
        return 0;
    }

    protected boolean efectoEsValido(){
        return turnosValidos>0;
    }

    public double efectoRebote(Personaje atacante){
        return 0; //a futuro podria inflijir
    }
}
