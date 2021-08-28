package etapa02.atividade02.questao03;

public class Deferido implements EstadoProcesso {

    @Override
    public void validar(Processo processo) {
        throw new RuntimeException("Processo deferido, não é possível validar!");
    }

    @Override
    public void avaliar(Processo processo) {
        throw new RuntimeException("Processo deferido, não é possível avaliar!");
    }

    @Override
    public void deferir(Processo processo) {
        throw new RuntimeException("Processo deferido, não é possível deferir!");
    }

    @Override
    public void indeferir(Processo processo) {
        throw new RuntimeException("Processo deferido, não é possível indeferir!");
    }

    @Override
    public void fechar(Processo processo) {
        System.out.println("...Fechando processo...");
        processo.estadoProcesso = new Fechado();
        System.out.println("------------------------------------------");
    }

    @Override
    public void cancelar(Processo processo) {
        throw new RuntimeException("Processo deferido, não é possível cancelar!");
    }

    @Override
    public  void apresentarRecurso(Processo processo){
        throw new RuntimeException("Processo deferido, não é possível apresentar recurso!");
    }
}
