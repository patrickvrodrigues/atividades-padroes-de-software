package etapa03.atividade01.questao05;

public class ElevacaoTempAmbienteCommand implements RoboAction {
    private Robo robo;

    public ElevacaoTempAmbienteCommand(Robo robo){
        this.robo = robo;
    }

    public void execute(){
        this.robo.elevarTemperaturaAmbiente();
    }
}
