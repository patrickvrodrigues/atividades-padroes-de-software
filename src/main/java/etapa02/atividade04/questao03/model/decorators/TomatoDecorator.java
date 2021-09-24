package etapa02.atividade04.questao03.model.decorators;

import etapa02.atividade04.questao03.model.IPizza;

public class TomatoDecorator extends CondimentDecorator{
    public TomatoDecorator(IPizza pizza){
        super(pizza);
    }

    @Override
    public void setDescription(String description) {
        this.pizza.setDescription(", tomate ");
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription();
    }
    public double cost(){
        double newCost;
        newCost = this.pizza.cost() + 0.1;
        return newCost;
    }

}
