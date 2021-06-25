package etapa01.atividade02.questao08;

public class ICMS implements Imposto {

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.25;
    }
}
