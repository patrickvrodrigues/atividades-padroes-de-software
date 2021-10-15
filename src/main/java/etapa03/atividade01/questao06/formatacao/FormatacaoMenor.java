package etapa03.atividade01.questao06.formatacao;

import etapa03.atividade01.questao06.documentos.Documento;

public class FormatacaoMenor implements Formatacao{

    public void formatar(Documento documento){
        System.out.println("Titulo: " +documento.getTitulo() +
                " | Assunto: "+ documento.getAssunto() +
                " | Data: " + documento.getData()
                );
        System.out.println("Conteudo: " +documento.getConteudo());

    }
}
