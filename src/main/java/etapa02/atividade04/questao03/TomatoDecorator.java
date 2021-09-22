package etapa02.atividade04.questao03;

public class TomatoDecorator extends CondimentDecorator{
    public TomatoDecorator(IPizza pizza){
        super(pizza);
    }

    public double cost(){
        double newCost;
        newCost = this.cost() + 1.5;
        return newCost;
    }

    public void create(){
        this
    }
}
