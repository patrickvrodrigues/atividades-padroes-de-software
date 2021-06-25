package etapa01.prova01.questao06;

public class Documento {
    private String numeroDocumento;
    private TiposDocumento tipoDocumento;

    public Documento(String numeroDocumento, TiposDocumento tipoDocumento){
        this.numeroDocumento = numeroDocumento;
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento(){
        return this.numeroDocumento;
    }

    public TiposDocumento getTipoDocumento(){
        return this.tipoDocumento;
    }
}
