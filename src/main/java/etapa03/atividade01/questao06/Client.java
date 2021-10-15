package etapa03.atividade01.questao06;

import etapa03.atividade01.questao06.documentos.Comprovante;
import etapa03.atividade01.questao06.documentos.Documento;
import etapa03.atividade01.questao06.documentos.Requisicao;
import etapa03.atividade01.questao06.formatacao.Formatacao;
import etapa03.atividade01.questao06.formatacao.FormatacaoMenor;
import etapa03.atividade01.questao06.formatacao.FormatacaoPadrao;

public class Client {
    public static void main(String[] args){
        Documento documentoComprovante = new Comprovante("Compra de carro",
                "Comprovante de compra de carro para demais providenciais"
                );
        Documento documentoRequisicao = new Requisicao("Requisicao de compra de café",
                "Preciso de 10 pacotes de café");

        Formatacao formatacaoMenor = new FormatacaoMenor();
        Formatacao formatacaoPadrao = new FormatacaoPadrao();

        System.out.println("################# Comprovante ################# \n");
        formatacaoPadrao.formatar(documentoComprovante);
        System.out.println("-----------------------------------");
        formatacaoMenor.formatar(documentoComprovante);
        System.out.println("################# Requisição ################# \n");
        formatacaoPadrao.formatar(documentoRequisicao);
        System.out.println("-----------------------------------");
        formatacaoMenor.formatar(documentoRequisicao);



    }
}
