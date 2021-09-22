package etapa02.atividade04.questao03;

public class BaconDecorator extends CondimentDecorator{
    public BaconDecorator(IPizza pizza){
        super(pizza);
    }

    public double cost(){
        double newCost;
        newCost = this.cost() + 2;
        return newCost;
    }
}
