package etapa02.atividade01.questao04.factory;

import etapa02.atividade01.questao04.model.Completo;
import etapa02.atividade01.questao04.model.ImpostoDeRenda;

public class ImpostoDeRendaCompletoFactory extends ImpostoDeRendaFactory{
    @Override
    public ImpostoDeRenda createImposto() {
        return new Completo();
    }
}
