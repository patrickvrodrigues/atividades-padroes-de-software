package etapa02.atividade01.questao04;


public class TesteImpostoDeRenda {
    public static void main(String[] args){
        ImpostoDeRendaCreator creator = new ImpostoDeRendaCreator();

        //Imposto de Renda Simplificado
        ImpostoDeRenda imposto1 = creator.create(ImpostoDeRendaCreator.SIMPLIFICADO);
        imposto1.calcula();

        //Imposto de Renda Completo
        ImpostoDeRenda imposto2 = creator.create(ImpostoDeRendaCreator.COMPLETO);
        imposto2.calcula();

    }
}
