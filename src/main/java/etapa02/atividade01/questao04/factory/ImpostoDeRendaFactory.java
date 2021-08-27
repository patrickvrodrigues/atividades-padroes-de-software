package etapa02.atividade01.questao04.factory;

import etapa02.atividade01.questao04.model.ImpostoDeRenda;

public abstract class ImpostoDeRendaFactory {
    public ImpostoDeRenda orderImposto(){
        ImpostoDeRenda imposto = null;

        imposto = createImposto();

        imposto.calcula();

        return imposto;

    }

    protected abstract ImpostoDeRenda createImposto();
}
