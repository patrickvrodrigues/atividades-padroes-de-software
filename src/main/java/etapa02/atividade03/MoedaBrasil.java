package etapa02.atividade03;

public class MoedaBrasil implements IMoeda {
    double valor;

    public MoedaBrasil(double valor){
        this.valor = valor;
    }
    @Override
    public double getMoeda(){
       return this.valor;
    }

    @Override
    public String toString() {
        return "R$ " + valor;
    }
}
