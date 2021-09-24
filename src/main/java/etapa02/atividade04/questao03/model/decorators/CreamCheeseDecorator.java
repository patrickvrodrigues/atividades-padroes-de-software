package etapa02.atividade04.questao03.model.decorators;


import etapa02.atividade04.questao03.model.IPizza;

public class CreamCheeseDecorator extends CondimentDecorator{
    public CreamCheeseDecorator(IPizza pizza){
        super(pizza);
    }

    @Override
    public void setDescription(String description) {
        this.pizza.setDescription(", Cream Cheese ");
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription();
    }

    public double cost(){
        double newCost;
        newCost = this.pizza.cost() + 1.2;
        return newCost;
    }
}


