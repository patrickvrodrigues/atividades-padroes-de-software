package etapa01.prova01.questao07;

public abstract class Relatorio {
    private String conteudo;
    protected Dados dados;

    public Relatorio(String conteudo, Dados dados){
        this.conteudo = conteudo;
        this.dados = dados;
    }

    public void geraCabecalho(){
        System.out.println(dados.getNomeBanco());
    }

    private void geraConteudo(){
        System.out.println(this.conteudo);
    }

    public void geraRodape(){
        System.out.println(dados.getTelefone());
    }

    public final void geraRelatorio(){
        this.geraCabecalho();
        System.out.println("-------------------------------------------");
        this.geraConteudo();
        System.out.println("-------------------------------------------");
        this.geraRodape();
    }
}
