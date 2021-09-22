package etapa02.atividade04.questao02;

public class NumeroUmDecoratorComParenteses extends NumeroUmDecorator{
    public NumeroUmDecoratorComParenteses(NumeroUm numeroUm){
        super(numeroUm);
    }

    public void imprime(String numero){
        System.out.println("Imprimindo numero um com parenteses");
        numero = acrescentaParenteses(numero);
        this.getNumeroUm().imprime(numero);

    }

    private String acrescentaParenteses(String numero){
        String numeroComParenteses = "("+numero+")";
        return numeroComParenteses;
    }

}
