package etapa01.atividade02.questao08;

public class TesteCalculoImposto {

    public static void main(String[] args ) {
        Imposto icms = new ICMS();
        Imposto iss = new ISS();
        Imposto impostoCondicional = new ImpostoCondicional();

        Orcamento orcamento = new Orcamento(2000);

        CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();
        calculadorDeImpostos.realizaCalculo(orcamento, iss );
        calculadorDeImpostos.realizaCalculo(orcamento, icms );
        calculadorDeImpostos.realizaCalculo(orcamento, impostoCondicional);

    }
}