package etapa03.atividade01.questao05;

import java.util.ArrayList;
import java.util.List;

public class Experimento {
    public List<RoboAction> commandList;

    public Experimento(){
        this.commandList = new ArrayList<>();
    }

    public void addCommand(RoboAction command){
        this.commandList.add(command);
    }

    public void executeCommands(){
        for(RoboAction command : this.commandList){
            command.execute();
        }
    }
}
