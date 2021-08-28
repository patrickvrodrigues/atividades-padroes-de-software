package etapa02.atividade02.questao03;

public class Fechado implements EstadoProcesso {
    @Override
    public void validar(Processo processo) {
        throw new RuntimeException("Processo Fechado, não é possível validar!");
    }

    @Override
    public void avaliar(Processo processo) {
        throw new RuntimeException("Processo Fechado, não é possível avaliar!");
    }

    @Override
    public void deferir(Processo processo) {
        throw new RuntimeException("Processo Fechado, não é possível deferir!");
    }

    @Override
    public void indeferir(Processo processo) {
        throw new RuntimeException("Processo Fechado, não é possível indeferir!");
    }

    @Override
    public void fechar(Processo processo) {
        throw new RuntimeException("Processo Fechado, não é possível fechar!");
    }

    @Override
    public void cancelar(Processo processo) {
        throw new RuntimeException("Processo Fechado, não é possível cancelar!");
    }

    @Override
    public  void apresentarRecurso(Processo processo){
        throw new RuntimeException("Processo Fechado, não é possível apresentar recurso!");
    }
}
