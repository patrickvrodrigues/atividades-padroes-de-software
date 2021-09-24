package etapa02.atividade04.questao03.model;

public class Pepperoni implements IPizza{
    private String description = "";

    public Pepperoni(){
        System.out.println("Preparando pizza de Peperoni " + description);
    }

    public void setDescription(String description){
        this.description = this.description + description;
    }

    public String getDescription(){
        return this.description;
    }
    public double cost(){
        return 14.9;
    }


}
