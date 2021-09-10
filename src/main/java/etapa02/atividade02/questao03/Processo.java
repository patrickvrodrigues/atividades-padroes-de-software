package etapa02.atividade02.questao03;

public class Processo {
    EstadoProcesso estadoProcesso;

    public Processo(){
        estadoProcesso = new Gestacao();
    }


    public void validar() {
        estadoProcesso.validar(this);
    }
    public void avaliar(){
        estadoProcesso.avaliar(this);
    }
    public void deferir() {
        estadoProcesso.deferir(this);
    }
    public void indeferir(){
        estadoProcesso.indeferir(this);
    }
    public void fechar(){
        estadoProcesso.fechar(this);
    }
    public void cancelar(){
        estadoProcesso.cancelar(this);
    }

    public void apresentarRecurso(){
        estadoProcesso.apresentarRecurso(this);
    }
}
