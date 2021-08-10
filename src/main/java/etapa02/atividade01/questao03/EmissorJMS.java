package etapa02.atividade01.questao03;

public class EmissorJMS implements Emissor{
    public void envia(String message){
        System.out.println("Enviando por JMS a menssagem");
        System.out.println(message);
    }
}
