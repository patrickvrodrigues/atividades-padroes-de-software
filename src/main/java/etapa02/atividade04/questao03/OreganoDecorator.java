package etapa02.atividade04.questao03;

public class OreganoDecorator extends CondimentDecorator{
    public OreganoDecorator(IPizza pizza){
        super(pizza);
    }

    public double cost(){
        double newCost;
        newCost = this.cost() + 0.5;
        return newCost;
    }
}
