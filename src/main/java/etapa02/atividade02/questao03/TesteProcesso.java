package etapa02.atividade02.questao03;

public class TesteProcesso {
    public static void main(String[] args){
        Processo processo = new Processo();
        System.out.println(processo.estadoProcesso);
        processo.validar();
        processo.cancelar();

        System.out.println("########### Teste 2 ###########");
        Processo processo2 = new Processo();
        processo2.validar();
        processo2.avaliar();
        processo2.deferir();
        processo2.fechar();


        System.out.println("######## Teste 3 #########");

        Processo processo3 = new Processo();
        processo3.validar();
        processo3.avaliar();
        processo3.indeferir();
        processo3.apresentarRecurso();
        processo3.avaliar();
        processo3.deferir();
        processo3.fechar();
    }
}
