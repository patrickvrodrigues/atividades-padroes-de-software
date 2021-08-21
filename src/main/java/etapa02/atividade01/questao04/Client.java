package etapa02.atividade01.questao04;


import etapa02.atividade01.questao04.factory.ImpostoDeRendaCompletoFactory;
import etapa02.atividade01.questao04.factory.ImpostoDeRendaFactory;
import etapa02.atividade01.questao04.factory.ImpostoDeRendaSimplificadoFactory;
import etapa02.atividade01.questao04.model.ImpostoDeRenda;

public class Client {
    public static void main (String[] args){
        ImpostoDeRendaFactory impostoSimplificado = new ImpostoDeRendaSimplificadoFactory();
        ImpostoDeRendaFactory impostoCompleto = new ImpostoDeRendaCompletoFactory();

        System.out.println("#########Criando simplificado###########");
        ImpostoDeRenda imposto1 = impostoSimplificado.orderImposto();
        System.out.println(imposto1);

        System.out.println("#########Criando completo###########");
        ImpostoDeRenda imposto2 = impostoCompleto.orderImposto();
        System.out.println(imposto2);


    }
}
