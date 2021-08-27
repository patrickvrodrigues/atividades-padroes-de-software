package etapa02.atividade01.questao04.factory;

import etapa02.atividade01.questao04.model.ImpostoDeRenda;
import etapa02.atividade01.questao04.model.Simplificado;

public class ImpostoDeRendaSimplificadoFactory extends ImpostoDeRendaFactory{
    @Override
    public ImpostoDeRenda createImposto() {
        return new Simplificado();
    }
}
