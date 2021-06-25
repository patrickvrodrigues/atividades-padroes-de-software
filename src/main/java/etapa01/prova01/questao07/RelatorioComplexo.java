package etapa01.prova01.questao07;

import java.text.DateFormat;
import java.util.Date;

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
        String dStr = DateFormat.getDateInstance(DateFormat.MEDIUM).format(dataAtual);
        return dStr;
    }
}
