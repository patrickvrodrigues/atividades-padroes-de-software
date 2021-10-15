package etapa02.atividade04.exemplo;

public enum SexoEnum {
    MASCULINO("Masculino"), FEMININO("Feminino");

    private String descricao;

    SexoEnum(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }
}
