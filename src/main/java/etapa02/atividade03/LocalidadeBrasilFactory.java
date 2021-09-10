package etapa02.atividade03;

import java.util.Date;

public class LocalidadeBrasilFactory implements  LocalidadeAbstractFactory{
    @Override
    public IMoeda getMoeda(double valor) {
        return new MoedaBrasil(valor);
    }

    @Override
    public IData getData(Date data) {
        return new DataBrasil(data);
    }
}
