package etapa02.atividade03;

import java.util.Date;

public interface LocalidadeAbstractFactory {
    IMoeda getMoeda(double valor);
    IData getData(Date data);
}
