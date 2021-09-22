package etapa02.atividade04.questao03;


public class CreamCheeseDecorator extends CondimentDecorator{
    public CreamCheeseDecorator(IPizza pizza){
        super(pizza);
    }

    public double cost(){
        double newCost;
        newCost = this.cost() + 1.5;
        return newCost;
    }
}


