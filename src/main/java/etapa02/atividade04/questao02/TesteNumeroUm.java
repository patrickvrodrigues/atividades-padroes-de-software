package etapa02.atividade04.questao02;



public class TesteNumeroUm {
    public static void main(String[] args){
        String numero = "1";

        NumeroUm numeroUmComChaves = new NumeroUmDecoratorComChaves(new NumeroUmBasico());
        numeroUmComChaves.imprime(numero);

        NumeroUm numeroUmComColchetes = new NumeroUmDecoratorComColchetes(new NumeroUmBasico());
        numeroUmComColchetes.imprime(numero);

        NumeroUm numeroUmComParenteses = new NumeroUmDecoratorComParenteses(new NumeroUmBasico());
        numeroUmComParenteses.imprime(numero);

        NumeroUm numeroUmComChavesParentesesColchetes =new NumeroUmDecoratorComColchetes(
                new NumeroUmDecoratorComParenteses(numeroUmComChaves)
        );
        numeroUmComChavesParentesesColchetes.imprime(numero);

    }
}
