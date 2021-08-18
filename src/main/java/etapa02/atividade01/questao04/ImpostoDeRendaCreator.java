package etapa02.atividade01.questao04;

public class ImpostoDeRendaCreator {
    public static final int SIMPLIFICADO = 0;
    public static final int COMPLETO = 1;

    public ImpostoDeRenda create(int tipoDeImposto){
        if(tipoDeImposto == ImpostoDeRendaCreator.SIMPLIFICADO){
            return new ImpostoDeRendaSimplificado();
        }else if (tipoDeImposto == ImpostoDeRendaCreator.COMPLETO){
            return new ImpostoDeRendaCompleto();
        }else{
            throw new IllegalArgumentException("Tipo de imposto não suportado");
        }
    }

}
