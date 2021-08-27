package etapa02.atividade02.questao02;

public class TesteTransacoes {
    public static void main(String[] args){
        ContaBancaria conta1 = new ContaBancaria(1000);

        conta1.deposita(500);

        conta1.saca(1500);


    }
}
