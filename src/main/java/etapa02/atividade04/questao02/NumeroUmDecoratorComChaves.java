package etapa02.atividade04.questao02;

public class NumeroUmDecoratorComChaves extends NumeroUmDecorator{
    public NumeroUmDecoratorComChaves(NumeroUm numeroUm){
        super(numeroUm);
    }

    public void imprime(String numero){
        System.out.println("Imprimindo numero um com chaves");
        numero = acrescentaChaves(numero);
        this.getNumeroUm().imprime(numero);

    }

    private String acrescentaChaves(String numero){
        String numeroComChaves = "{"+numero+"}";
        return numeroComChaves;
    }

}
