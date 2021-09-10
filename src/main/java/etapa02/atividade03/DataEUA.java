package etapa02.atividade03;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DataEUA implements IData {
    private Date data;

    public DataEUA(Date data){
        this.data = data;
    }

    @Override
    public String toString() {
        return new SimpleDateFormat("yyyy-MM-dd").format(data);

    }
}
