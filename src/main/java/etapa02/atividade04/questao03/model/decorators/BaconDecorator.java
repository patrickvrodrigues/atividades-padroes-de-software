package etapa02.atividade04.questao03.model.decorators;

import etapa02.atividade04.questao03.model.IPizza;

public class BaconDecorator extends CondimentDecorator{

    public BaconDecorator(IPizza pizza){
        super(pizza);
    }

    @Override
    public void setDescription(String description) {
        this.pizza.setDescription(", bacon ");
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription();
    }

    public double cost(){
        double newCost= 0;
        newCost = this.pizza.cost() + 0.8;
        return newCost;
    }
}
