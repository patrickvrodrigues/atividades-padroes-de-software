package etapa02.atividade02.questao03;

import etapa02.atividade02.questao03.EstadoProcesso;
import etapa02.atividade02.questao03.Processo;

public class Gestacao implements EstadoProcesso {
    @Override
    public void validar(Processo processo) {
        System.out.println(".....Validando processo.....");
        System.out.println("/n");
        processo.estadoProcesso = new Criado();
        System.out.println(".....Processo criado......");
        System.out.println("------------------------------------------");
    }

    @Override
    public void avaliar(Processo processo) {
        throw new RuntimeException("Não é possível avaliar, apenas validar");
    }

    @Override
    public void deferir(Processo processo) {
        throw new RuntimeException("Não é possível deferir, apenas validar");
    }

    @Override
    public void indeferir(Processo processo) {
        throw new RuntimeException("Não é possível indeferir, apenas validar");
    }

    @Override
    public void fechar(Processo processo) {
        throw new RuntimeException("Não é possível fechar, apenas validar");
    }

    @Override
    public void cancelar(Processo processo) {
        throw new RuntimeException("Não é possível cancelar, apenas validar");
    }

    @Override
    public  void apresentarRecurso(Processo processo){
        throw new RuntimeException("Não é possível apresentar recurso!");
    }
}
