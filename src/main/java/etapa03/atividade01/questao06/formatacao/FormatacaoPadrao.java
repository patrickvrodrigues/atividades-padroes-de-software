package etapa03.atividade01.questao06.formatacao;

import etapa03.atividade01.questao06.documentos.Documento;

public class FormatacaoPadrao implements Formatacao{
    public void formatar(Documento documento){
        System.out.println("Titulo: " +documento.getTitulo());
        System.out.println("Assunto: " +documento.getAssunto());
        System.out.println("Conteudo: " +documento.getConteudo());
        System.out.println("Data: " +documento.getData());
    }
}
