package etapa01.atividade02.questao11;

public class Dados {
    String nomeBanco;
    private String titular;
    private int agencia;
    private int conta;
    private double saldo;
    private String telefone;
    private String endereco;
    private String email;

    public Dados(String nomeBanco, String titular, int agencia,
                 int conta, double saldo, String telefone,
                 String email, String endereco){
        this.nomeBanco = nomeBanco;
        this.titular = titular;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }
    public String getNomeBanco() {
        return nomeBanco;
    }

    public String getTitular() {
        return titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getEmail() {
        return email;
    }
}
