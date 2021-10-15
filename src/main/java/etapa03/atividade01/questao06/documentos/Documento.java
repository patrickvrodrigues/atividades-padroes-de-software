package etapa03.atividade01.questao06.documentos;

import java.time.LocalDate;

public abstract class Documento {
    private String titulo;
    private String assunto;
    private String conteudo;
    private LocalDate data;

    public Documento(String titulo, String assunto, String conteudo){
        this.titulo = titulo;
        this.assunto = assunto;
        this.conteudo = conteudo;
        this.data = LocalDate.now();

    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public LocalDate getData() {
        return data;
    }

}
