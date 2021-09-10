package etapa02.atividade03;

public class MoedaEUA implements IMoeda {
    double valor;

    public MoedaEUA(double valor){
        this.valor = valor;
    }
    @Override
    public double getMoeda(){
        return this.valor;
    }

    @Override
    public String toString() {
        return "$ " + valor;
    }
}
