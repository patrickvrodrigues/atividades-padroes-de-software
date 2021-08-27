package etapa02.atividade02.questao02;

public interface EstadoContaBancaria {
    void saca(ContaBancaria contaBancaria, double valor);
    void deposita(ContaBancaria contaBancaria, double valor);

    void positivar(ContaBancaria contaBancaria);
    void negativar(ContaBancaria contaBancaria);
}
