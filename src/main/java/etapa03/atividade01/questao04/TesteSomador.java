package etapa03.atividade01.questao04;

public class TesteSomador {
    public static void main(String[] args){
        Cliente teste = new Cliente(new SomadorAdapter());
        teste.executar();
    }
}
