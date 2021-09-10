package etapa02.atividade03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataBrasil implements IData {
    private Date data;
    public DataBrasil(Date data){
        this.data = data;
    }

    public Date getData(){
        return this.data;
    }

    @Override
    public String toString() {
        return new SimpleDateFormat("dd-MM-yyyy").format(data);

    }
}
