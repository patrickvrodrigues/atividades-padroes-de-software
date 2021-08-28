package etapa02.atividade02.questao03;

public interface EstadoProcesso {

    void validar(Processo processo);
    void avaliar(Processo processo);
    void deferir(Processo processo);
    void indeferir(Processo processo);
    void fechar(Processo processo);
    void cancelar(Processo processo);
    void apresentarRecurso(Processo processo);

}
