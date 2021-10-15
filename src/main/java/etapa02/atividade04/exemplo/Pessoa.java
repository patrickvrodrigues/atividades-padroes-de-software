package etapa02.atividade04.exemplo;

public class Pessoa {
    private String nome;
    private String cpf;
    private SexoEnum sexo;

    public Pessoa(String nome, String cpf, SexoEnum sexo){
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo.getDescricao();
    }

    public void setSexo(SexoEnum sexo) {
        this.sexo = sexo;
    }
}
