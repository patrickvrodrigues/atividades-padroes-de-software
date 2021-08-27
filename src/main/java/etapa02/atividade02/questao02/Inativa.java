package etapa02.atividade02.questao02;

public class Inativa implements  EstadoContaBancaria{

    public void saca(ContaBancaria contaBancaria, double valor) {
        throw new RuntimeException("A conta está inativa ");
    }

    public void deposita(ContaBancaria contaBancaria, double valor){
        contaBancaria.saldo = valor;
        contaBancaria.estadoAtual = new Positivo();
        System.out.println("###### Valor depositado: "+ valor + "######");
        System.out.println("###### Saldo atual: "+ contaBancaria.getSaldo() + "######");
    }

    @Override
    public void positivar(ContaBancaria contaBancaria){
        contaBancaria.estadoAtual = new Positivo();
    }
    @Override
    public void negativar(ContaBancaria contaBancaria){
        throw new RuntimeException("A conta está inativa ");
    }
}
