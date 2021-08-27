package etapa02.atividade02.questao02;

public class ContaBancaria {
    double saldo;
    EstadoContaBancaria estadoAtual;

    public ContaBancaria(){
        this.estadoAtual = new Inativa();
    }

    public ContaBancaria(double valor){
        this.saldo = valor;
        this.estadoAtual = new Positivo();
    }

    public void positivar(){
        estadoAtual.positivar(this);
    }

    public void negativar(){
       estadoAtual.negativar(this);
    }

    public double getSaldo(){
        return this.saldo;
    }


    public void saca(double valor){
        estadoAtual.saca(this, valor);
    }

    public void deposita(double valor) {
        estadoAtual.deposita(this, valor);
    }
}
