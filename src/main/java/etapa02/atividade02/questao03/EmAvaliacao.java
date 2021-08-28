package etapa02.atividade02.questao03;

public class EmAvaliacao implements EstadoProcesso {
    @Override
    public void validar(Processo processo) {
        throw new RuntimeException("Processo Em Avaliação, não é possível validar!");
    }

    @Override
    public void avaliar(Processo processo) {
        throw new RuntimeException("Processo ja está em Avaliação!");
    }

    @Override
    public void deferir(Processo processo) {
        System.out.println("...Avaliando processo...");
        processo.estadoProcesso = new Deferido();
        System.out.println("Processo deferido!");
        System.out.println("------------------------------------------");
    }

    @Override
    public void indeferir(Processo processo) {
        System.out.println("...Avaliando processo...");
        processo.estadoProcesso = new Indeferido();
        System.out.println("Processo indeferido!");
        System.out.println("------------------------------------------");
    }

    @Override
    public void fechar(Processo processo) {
        throw new RuntimeException("Processo Em Avaliação, não é possível fechar!");
    }

    @Override
    public void cancelar(Processo processo) {
        throw new RuntimeException("Processo Em Avaliação, não é possível cancelar!");
    }

    @Override
    public  void apresentarRecurso(Processo processo){
        throw new RuntimeException("Processo Em Avaliação, não é possível apresentar recurso!");
    }
}
