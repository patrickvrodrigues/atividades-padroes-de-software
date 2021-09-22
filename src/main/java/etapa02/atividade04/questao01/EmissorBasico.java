package etapa02.atividade04.questao01;

public class EmissorBasico implements Emissor{
    public void envia(String mensagem){
        System.out.println("Enviando mensagem: ");
        System.out.println(mensagem);
    }
}
