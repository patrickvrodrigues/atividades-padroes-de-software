package etapa02.atividade02.questao02;

public class Positivo implements EstadoContaBancaria{

    public void saca(ContaBancaria contaBancaria, double valor){
        if (contaBancaria.getSaldo() >= ((valor*80)/100)) {
            contaBancaria.saldo = contaBancaria.saldo - valor;
            System.out.println("###### Retire seu valor: "+ valor + "######");
            if (contaBancaria.getSaldo()<0){
                contaBancaria.estadoAtual = new Negativo();
                System.out.println("A conta está negativa");
            }
        }else{
            throw new RuntimeException("Saldo insuficiente");
        }
    }

    public void deposita(ContaBancaria contaBancaria, double valor){
        double valorConvertido = (valor * 98)/100;
        contaBancaria.saldo = contaBancaria.saldo +valorConvertido;
        System.out.println("###### Valor depositado: "+ valor + "######");
        System.out.println("###### Saldo atual: "+ contaBancaria.getSaldo() + "######");
    }


    @Override
    public void positivar(ContaBancaria contaBancaria){
        throw new RuntimeException("A conta ja está positiva");
    }
    @Override
    public void negativar(ContaBancaria contaBancaria){
        contaBancaria.estadoAtual = new Negativo();
    }
}
