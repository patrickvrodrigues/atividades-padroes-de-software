package etapa03.atividade01.questao04;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class SomadorAdapter extends SomadorExistente implements SomadorEsperado{

    public SomadorAdapter(){
        super();
    }


    @Override
    public int somaVetor(int[] vetor) {
        List<Integer> valores = new ArrayList<>();
        for (int i=0; i<vetor.length; i++){
            valores.add(vetor[i]);
        }
        return super.somaLista(valores);
    }
}
