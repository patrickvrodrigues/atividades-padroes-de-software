package etapa02.atividade04.questao02;

public abstract class NumeroUmDecorator implements NumeroUm{
    private NumeroUm numeroUm;

    public NumeroUmDecorator(NumeroUm numeroUm){
        this.numeroUm = numeroUm;
    }

    public abstract void imprime(String numero);

    public NumeroUm getNumeroUm(){
        return this.numeroUm;
    }
}
