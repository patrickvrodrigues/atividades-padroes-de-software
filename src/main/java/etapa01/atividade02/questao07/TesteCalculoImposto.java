package etapa01.atividade02.questao07;

public class TesteCalculoImposto {

    public static void main(String[] args ) {
        Imposto icms = new ICMS();
        Imposto iss = new ISS();

        Orcamento orcamento = new Orcamento(2000);

        CalculadorDeImpostos calculadorDeImpostos = new CalculadorDeImpostos();
        calculadorDeImpostos.realizaCalculo(orcamento, iss );
        calculadorDeImpostos.realizaCalculo(orcamento, icms );

    }
}