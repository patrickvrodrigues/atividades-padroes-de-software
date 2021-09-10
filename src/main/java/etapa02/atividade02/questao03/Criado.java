package etapa02.atividade02.questao03;

import etapa02.atividade02.questao03.EstadoProcesso;
import etapa02.atividade02.questao03.Processo;

public class Criado implements EstadoProcesso {

    @Override
    public void validar(Processo processo) {
        throw new RuntimeException("Processo Criado, não é possível validar!");
    }

    @Override
    public void avaliar(Processo processo) {
        System.out.println("...Aguarde...");
        processo.estadoProcesso = new EmAvaliacao();
        System.out.println("Processo em avaliação!/n");
        System.out.println("------------------------------------------");
    }

    @Override
    public void deferir(Processo processo) {
        throw new RuntimeException("Processo Criado, não é possível deferir!");
    }

    @Override
    public void indeferir(Processo processo) {
        throw new RuntimeException("Processo Criado, não é possível indeferir!");
    }

    @Override
    public void fechar(Processo processo) {
        throw new RuntimeException("Processo Criado, não é possível fechar!");
    }

    @Override
    public void cancelar(Processo processo) {
        System.out.println("...Cancelando processo...");
        processo.estadoProcesso = new Fechado();
        System.out.println("Processo cancelado!");
        System.out.println("------------------------------------------");
    }
    @Override
    public  void apresentarRecurso(Processo processo){
        throw new RuntimeException("Processo Criado, não é possível apresentar recurso!");
    }
}
