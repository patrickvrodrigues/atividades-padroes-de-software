package etapa02.atividade03;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Factory {


    public static final int BRASIL = 0;
    public static final int EUA = 1;

    public LocalidadeAbstractFactory newLocalidade(int localidade){

        switch (localidade){
            case Factory.BRASIL:
                return new LocalidadeBrasilFactory();

            case Factory.EUA:
                return new LocalidadeEUAFactory();

            default:
                throw new IllegalArgumentException("Tipo de localidade não suportada");
        }

    }

    }
