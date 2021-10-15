package etapa03.atividade01.questao05;

public class App {
    public static void main(String[] args){
        Experimento experimento1 = new Experimento();

        Robo robo = new Robo();
        ElevacaoTempAmbienteCommand elevarTemperatura = new ElevacaoTempAmbienteCommand(robo);
        AplicarProdutoQuimicoCommand aplicarProdutoQuimico = new AplicarProdutoQuimicoCommand(robo);

        experimento1.addCommand(elevarTemperatura);
        experimento1.addCommand(aplicarProdutoQuimico);

        experimento1.executeCommands();
    }
}
