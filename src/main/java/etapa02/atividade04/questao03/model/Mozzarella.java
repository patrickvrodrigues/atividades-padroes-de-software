package etapa02.atividade04.questao03.model;

public class Mozzarella implements IPizza {
    private String description = "";

    public Mozzarella(){
        System.out.println("Preparando pizza de mozzarella " +description);
    }

    public void setDescription(String description){
        this.description = this.description + description;
    }

    public String getDescription(){
        return this.description;
    }
    public double cost(){
        return 11.9;
    }

}
