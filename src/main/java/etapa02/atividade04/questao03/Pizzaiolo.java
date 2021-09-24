package etapa02.atividade04.questao03;

import etapa02.atividade04.questao03.model.IPizza;
import etapa02.atividade04.questao03.model.Mozzarella;
import etapa02.atividade04.questao03.model.Pepperoni;
import etapa02.atividade04.questao03.model.decorators.BaconDecorator;
import etapa02.atividade04.questao03.model.decorators.CreamCheeseDecorator;
import etapa02.atividade04.questao03.model.decorators.OreganoDecorator;
import etapa02.atividade04.questao03.model.decorators.TomatoDecorator;

public class Pizzaiolo {

    public static void order(String name, IPizza pizza) {
        System.out.println("Criando pedido de " + name);
        pizza.getDescription();
        System.out.println(pizza.cost());
        System.out.println("---------------");
    }

    public static void main (String[] args){
        order("Pizza de mozzarella", new Mozzarella());
        order("Pizza de mozzarella com tomate", new TomatoDecorator(new Mozzarella()));
        order("Pizza de mozzarella com tomate e Cream Cheese", new CreamCheeseDecorator(new TomatoDecorator(new Mozzarella())));
        order("Pizza de pepperoni", new Pepperoni());
        order("Pizza de pepperoni, oregano e bacon", new OreganoDecorator(new BaconDecorator(new Pepperoni())));
        order("Pizza de pepperoni, oregano, bacon e tomate ", new OreganoDecorator(new BaconDecorator(new TomatoDecorator(new Pepperoni()))));
    }
}
