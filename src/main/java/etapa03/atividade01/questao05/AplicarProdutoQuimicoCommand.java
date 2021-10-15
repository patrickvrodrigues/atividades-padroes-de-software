package etapa03.atividade01.questao05;

public class AplicarProdutoQuimicoCommand implements RoboAction{

    private Robo robo;

    public AplicarProdutoQuimicoCommand(Robo robo){
        this.robo = robo;
    }

    public void execute(){
        this.robo.aplicarProdutoQuimico();
    }
}
