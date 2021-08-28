package etapa02.atividade02.questao03;

public class EmRecurso implements EstadoProcesso{
    @Override
    public void validar(Processo processo) {
        throw new RuntimeException("Processo em recurso, não é possível validar!");
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
        throw new RuntimeException("Processo em recurso, não é possível deferir!");
    }

    @Override
    public void indeferir(Processo processo) {
        throw new RuntimeException("Processo em recurso, não é possível indeferir!");
    }

    @Override
    public void fechar(Processo processo) {
        throw new RuntimeException("Processo em recurso, não é possível fechar!");
    }

    @Override
    public void cancelar(Processo processo) {
        throw new RuntimeException("Processo em recurso, não é possível cancelar!");
    }

    @Override
    public void apresentarRecurso(Processo processo) {
        throw new RuntimeException("Processo em recurso, não é possível apresentar recurso!");
    }
}
