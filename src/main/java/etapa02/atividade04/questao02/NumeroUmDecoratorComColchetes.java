package etapa02.atividade04.questao02;

public class NumeroUmDecoratorComColchetes extends NumeroUmDecorator{
    public NumeroUmDecoratorComColchetes(NumeroUm numeroUm){
        super(numeroUm);
    }

    public void imprime(String numero){
        System.out.println("Imprimindo numero um com colchetes");
        numero = acrescentaColchetes(numero);
        this.getNumeroUm().imprime(numero);

    }

    private String acrescentaColchetes(String numero){
        String numeroComColchetes = "["+numero+"]";
        return numeroComColchetes;
    }

}
