package etapa02.atividade01.questao03;

public class EmissorEmail implements Emissor{
    public void envia(String message){
        System.out.println("Enviando por email a menssagem");
        System.out.println(message);
    }
}
