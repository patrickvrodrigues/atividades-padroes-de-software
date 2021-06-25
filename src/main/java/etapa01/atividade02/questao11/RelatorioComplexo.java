package etapa01.atividade02.questao11;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class RelatorioComplexo extends Relatorio {
    public RelatorioComplexo(String conteudo, Dados dados) {
        super(conteudo, dados);
    }

    @Override
    public void geraCabecalho(){
        System.out.println(dados.getNomeBanco());
        System.out.println(dados.getEndereco());
        System.out.println(dados.getTelefone());
    }

    @Override
    public void geraRodape(){
        System.out.println(dados.getEmail());
        System.out.println(this.getDataAtual());
    }

    public String getDataAtual(){
        Date dataAtual = new Date();
        String dStr = java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(dataAtual);
        return dStr;
    }
}
