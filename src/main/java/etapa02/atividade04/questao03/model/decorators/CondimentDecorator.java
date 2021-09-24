package etapa02.atividade04.questao03.model.decorators;

import etapa02.atividade04.questao03.model.IPizza;

public abstract class CondimentDecorator implements IPizza {
    protected IPizza pizza;

    public CondimentDecorator(IPizza pizza){
        this.pizza = pizza;
    }

}
