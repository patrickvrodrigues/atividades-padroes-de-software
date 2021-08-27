package etapa02.atividade02.questao02;

public class Negativo implements  EstadoContaBancaria{

    public void saca(ContaBancaria contaBancaria, double valor) {
        throw new RuntimeException("A conta está negativada! ");
    }

    public void deposita(ContaBancaria contaBancaria, double valor){
        double valorConvertido = (valor * 95)/100;
        contaBancaria.saldo = valorConvertido;
        System.out.println("###### Valor depositado: "+ valor + "######");
        System.out.println("###### Saldo atual: "+ contaBancaria.getSaldo() + "######");
    }

    @Override
    public void positivar(ContaBancaria contaBancaria){
        contaBancaria.estadoAtual = new Positivo();
    }
    @Override
    public void negativar(ContaBancaria contaBancaria){
        throw new RuntimeException("A conta ja está negativa");
    }
}
