package etapa02.atividade03;

import java.util.Date;

public class LocalidadeEUAFactory implements LocalidadeAbstractFactory{

    @Override
    public IMoeda getMoeda(double valor) {
        return new MoedaEUA(valor);
    }

    @Override
    public IData getData(Date data) {
        return new DataEUA(data);
    }
}
