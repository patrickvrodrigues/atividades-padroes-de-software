package etapa01.atividade02.questao08;

public class CalculadorDeImpostos {

    public void realizaCalculo(Orcamento orcamento, Imposto imposto){

        double valor = imposto.calcula(orcamento );
        System.out.println(valor );

    }
}
