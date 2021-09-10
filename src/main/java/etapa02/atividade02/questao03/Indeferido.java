package etapa02.atividade02.questao03;

public class Indeferido implements EstadoProcesso{
    @Override
    public void validar(Processo processo) {
        throw new RuntimeException("Processo indeferido, não é possível validar!");
    }

    @Override
    public void avaliar(Processo processo) {
        throw new RuntimeException("Processo indeferido, não é possível avaliar!");
    }

    @Override
    public void deferir(Processo processo) {
        throw new RuntimeException("Processo indeferido, não é possível deferir!");
    }

    @Override
    public void indeferir(Processo processo) {
        throw new RuntimeException("Processo indeferido, não é possível indeferir!");
    }

    @Override
    public void fechar(Processo processo) {
        throw new RuntimeException("Processo indeferido, não é possível fechar!");
    }

    @Override
    public void cancelar(Processo processo) {
        throw new RuntimeException("Processo indeferido, não é possível cancelar!");
    }

    @Override
    public  void apresentarRecurso(Processo processo){
        System.out.println("...Aprensentando recurso...");
        processo.estadoProcesso = new EmRecurso();
        System.out.println("Processo em fase de recurso!");
        System.out.println("------------------------------------------");
    }
}
