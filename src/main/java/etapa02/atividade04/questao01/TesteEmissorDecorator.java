package etapa02.atividade04.questao01;

public class TesteEmissorDecorator {
    public static void main(String[] args){
        String mensagem = "Teste";

        Emissor emissorCript = new EmissorDecoratorComCriptografia(new EmissorBasico());
        emissorCript.envia(mensagem);

        Emissor emissorCompr = new EmissorDecoratorComCompressao(new EmissorBasico());
        emissorCompr.envia(mensagem);

        Emissor emissoCriptCompr = new EmissorDecoratorComCriptografia(new EmissorDecoratorComCompressao(new EmissorBasico()));
        emissoCriptCompr.envia(mensagem);
    }
}
