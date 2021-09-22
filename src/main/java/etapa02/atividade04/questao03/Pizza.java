package etapa02.atividade04.questao03;

public abstract class Pizza implements IPizza {

    private String description;

    public Pizza(String description){
        this.description = description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }

    public double cost(){
        return 10;
    }

    public void create(String description){
        this.description = this.description + description;
    }



}
