package etapa02.atividade04.questao04;

import java.util.HashSet;
import java.util.Set;

public class Acao {
    private final String codigo;
    private double valor;
    private Set<AcaoObserver> interessados = new HashSet<>();

    public Acao(String codigo, double valor){
        this.codigo = codigo;
        this.valor = valor;
    }

    public void registraInteressado(AcaoObserver interassado){
        this.interessados.add(interassado);
    }

    public void cancelaInteresse(AcaoObserver interessado){
        this.interessados.remove(interessado);
    }


    public double getValor(){
        return this.valor;
    }

    public void setValor(double valor){
        this.valor = valor;
        for (AcaoObserver interessado : this.interessados){
            interessado.notificaAlteracao(this);
        }
    }

    public String getCodigo(){
        return this.codigo;
    }
}
