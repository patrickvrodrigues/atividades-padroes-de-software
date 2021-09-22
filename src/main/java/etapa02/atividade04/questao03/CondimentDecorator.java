package etapa02.atividade04.questao03;

public abstract class CondimentDecorator implements IPizza{
    private IPizza pizza;

    public CondimentDecorator(IPizza pizza){
        this.pizza = pizza;
    }

    public abstract double cost();
}
