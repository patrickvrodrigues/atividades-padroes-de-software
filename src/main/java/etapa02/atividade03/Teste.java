package etapa02.atividade03;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Properties;

public class Teste {
    public static void main(String[] args) {

    //Criação da fábrica generica
    Factory factory = new Factory();
    //Recepção da localidade, ocorrendo o recebimento de uma função de instaciação da Factory especifica
    LocalidadeAbstractFactory localidadeAbstractFactory = factory.newLocalidade(Factory.BRASIL);

    System.out.println("---------- Exibindo valores da região do Brasil ---------- ");
    System.out.println(localidadeAbstractFactory.getData(Date.valueOf(LocalDate.now())));
    System.out.println(localidadeAbstractFactory.getMoeda(115));

        //Recepção da localidade, ocorrendo o recebimento de uma função de instaciação da Factory especifica
    localidadeAbstractFactory = factory.newLocalidade(Factory.EUA);

    System.out.println("\n---------- Exibindo valores da região do EUA ----------");
    System.out.println(localidadeAbstractFactory.getData(Date.valueOf(LocalDate.now())));
    System.out.println(localidadeAbstractFactory.getMoeda(115));

}
    }
