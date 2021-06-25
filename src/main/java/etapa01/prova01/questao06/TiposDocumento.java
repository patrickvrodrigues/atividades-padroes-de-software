package etapa01.prova01.questao06;

public enum TiposDocumento {
    CPF(1),CNPJ(2);

    public int documento;

    TiposDocumento(int documento){
        this.documento = documento;
    }
}
